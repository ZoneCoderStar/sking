package com.sking.model;

import com.sking.entity.BaseModules;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Table(name = "sking.base_modules")
public class BaseModulesModel {
    @Id
    private String moduleid;

    @Column(name = "module_name")
    private String moduleName;

    private Integer state;

    private String remarks;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "order_no")
    private Integer orderNo;

    @Column(name = "module_url")
    private String moduleUrl;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "power_num")
    private String powerNum;

    private List<BaseModules> childModuleList;

    /**
     * @return moduleid
     */
    public String getModuleid() {
        return moduleid;
    }

    /**
     * @param moduleid
     */
    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * @return module_name
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * @param moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return order_no
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<BaseModules> getChildModuleList() {
        return childModuleList;
    }

    public void setChildModuleList(List<BaseModules> childModuleList) {
        this.childModuleList = childModuleList;
    }

    public String getPowerNum() {
        return powerNum;
    }

    public void setPowerNum(String powerNum) {
        this.powerNum = powerNum;
    }
}