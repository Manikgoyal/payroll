/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author manik
 */


@Entity
@Table(name = "permissions",catalog = "hibernatedb")
public class Permissions implements Serializable{

    @Id
    @GeneratedValue
    private int permissionid;
    
    private String permissionname;
    
    private String description;
   
    private String status;
    
    
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pk1.permissions")
    private Set<UserPermission> userPermissions=new HashSet<UserPermission>(0);

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pk2.permissions")
    private Set<GroupPermissions> groupPermissionses=new HashSet<GroupPermissions>(0);

    public int getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(int permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserPermission> getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(Set<UserPermission> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public Set<GroupPermissions> getGroupPermissionses() {
        return groupPermissionses;
    }

    public void setGroupPermissionses(Set<GroupPermissions> groupPermissionses) {
        this.groupPermissionses = groupPermissionses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}   
