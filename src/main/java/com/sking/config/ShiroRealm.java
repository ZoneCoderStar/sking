package com.sking.config;

import com.sking.entity.BaseModules;
import com.sking.entity.BaseRoles;
import com.sking.entity.BaseUsers;
import com.sking.service.BaseModulesService;
import com.sking.service.BaseRolesService;
import com.sking.service.BaseUsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 添加Relam认证
 * Created by cdyoue on 2016/10/21.
 */

public class ShiroRealm extends AuthorizingRealm {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BaseUsersService userService;
    @Autowired
    private BaseModulesService baseModulesService;
    @Autowired
    private BaseRolesService baseRolesService;

    /**
     * doGetAuthorizationInfo()是权限控制
     *
     * 此方法调用  hasRole,hasPermission的时候才会进行回调.
     *
     * 权限信息.(授权):
     * 1、如果用户正常退出，缓存自动清空；
     * 2、如果用户非正常退出，缓存自动清空；
     * 3、如果我们修改了用户的权限，而用户不退出系统，修改的权限无法立即生效。
     * （需要手动编程进行实现；放在service进行调用）
     * 在权限修改后调用realm中的方法，realm已经由spring管理，所以从spring中获取realm实例，
     * 调用clearCached方法；
     * :Authorization 是授权访问控制，用于对用户进行的操作授权，证明该用户是否允许进行当前操作，如访问某个链接，某个资源文件等。
     * @param
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("<<<doGetAuthorizationInfo----+"+principalCollection.toString());
        BaseUsers user = userService.selectBaseUsersByLoginnum((String) principalCollection.getPrimaryPrincipal());


        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getUserid()),SecurityUtils.getSubject().getPrincipals());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        String userId = user.getUserid();
        List<BaseRoles> rolesList = baseRolesService.selectRolesListByUserid(userId);
        //赋予角色
        /*for(BaseRoles roles:rolesList){
            info.addRole(roles.getRoleKey());
        }*/
        List<BaseModules> modulesList = baseModulesService.selectModulesListByUserid(userId);
        //赋予权限
        for(BaseModules modules:modulesList){
            info.addStringPermission(modules.getPowerNum());
        }

        //设置登录次数、时间
//        userService.updateUserLogin(user);
        return info;
    }

    /**
     * doGetAuthenticationInfo主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info(">>>doGetAuthenticationInfo----------------- +"  + authenticationToken.toString());

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName= authenticationToken.getPrincipal().toString();
//        String userName=token.getUsername();
        logger.info("用户名 "+userName+token.getPassword());

        BaseUsers user = userService.selectBaseUsersByLoginnum(token.getUsername());
        if (user != null) {
//            byte[] salt = Encodes.decodeHex(user.getSalt());
//            ShiroUser shiroUser=new ShiroUser(user.getId(), user.getLoginName(), user.getName());

            //加密方式;
            //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
            /*SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    userName, //用户名
                    user.getPassword(), //密码
                    ByteSource.Util.bytes(user.getCredentialsSalt()),//密码盐salt=username+salt
                    getName()  //realm name
            );*/

            //明文: 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
            //设置用户session
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user", user);
            return new SimpleAuthenticationInfo(userName,user.getPassword(),getName());
        } else {
            return null;
        }
//        return null;
    }

    /**
     * 重写方法,清除当前用户的的 授权缓存
     * @param principals
     */
    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    /**
     * 重写方法，清除当前用户的 认证缓存
     * @param principals
     */
    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    /**
     * 自定义方法：清除所有 授权缓存
     */
    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    /**
     * 自定义方法：清除所有 认证缓存
     */
    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    /**
     * 自定义方法：清除所有的  认证缓存  和 授权缓存
     */
    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }
}

