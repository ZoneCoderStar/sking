package com.sking.entity;

import javax.persistence.*;

@Table(name = "sking.base_roles_modules")
public class BaseRolesModules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String roleid;

    private String moduleid;

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
}