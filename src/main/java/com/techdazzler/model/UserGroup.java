/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.model;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author manik
 */

@Entity
@Table(name = "user_group",catalog = "hibernatedb")
@AssociationOverrides({
    @AssociationOverride(name = "pk.users",joinColumns = @JoinColumn(name = "id_student")),
    @AssociationOverride(name = "pk.groups",joinColumns = @JoinColumn(name = "id_groups"))
})
public class UserGroup implements Serializable{
    
    @EmbeddedId
    private UserGroupId pk=new UserGroupId();
    
    private String createDate;

    @Transient
    public Users getUsers() {
        return getPk().getUsers();
    }

    public void setUsers(Users users) {
        getPk().setUsers(users);
    }

    @Transient
    public Groups getGroups() {
        return getPk().getGroups();
    }

    public void setGroups(Groups groups) {
        getPk().setGroups(groups);
    }
    
    
    
    
    public UserGroupId getPk() {
        return pk;
    }

    public void setPk(UserGroupId pk) {
        this.pk = pk;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    
    
    
}
