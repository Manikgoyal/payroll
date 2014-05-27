/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
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
@Table(name = "groups",catalog = "hibernatedb")
public class Groups implements Serializable {
    
    @Id
    @GeneratedValue
    private int groupid;
    
    private String groupname;
    
    private String description;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pk.groups")
    private Set<UserGroup> userGroups=new HashSet<UserGroup>(0);

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pk2.groups")
    private Set<GroupPermissions> userPermissions=new HashSet<GroupPermissions>(0);

    public Set<GroupPermissions> getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(Set<GroupPermissions> userPermissions) {
        this.userPermissions = userPermissions;
    }

    
    
    public Set<UserGroup> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Set<UserGroup> userGroups) {
        this.userGroups = userGroups;
    }
    
    
    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }
    
    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
        
   
    
}
