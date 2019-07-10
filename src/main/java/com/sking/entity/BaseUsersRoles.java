package com.sking.entity;

import javax.persistence.*;

@Table(name = "sking.base_users_roles")
public class BaseUsersRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String userid;

    private String roleid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}