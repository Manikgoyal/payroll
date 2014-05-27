/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author manik
 */

@Entity
@Table(name = "users",catalog ="hibernatedb")
public class Users implements Serializable{
    
    @Id
    private String username;
    
    private String name;
    
    private String password;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pk.users",cascade = CascadeType.ALL)
    private Set<UserGroup> usergroups=new HashSet<UserGroup>(0);

    public Set<UserGroup> getUsergroups() {
        return usergroups;
    }

    public void setUsergroups(Set<UserGroup> usergroups) {
        this.usergroups = usergroups;
    }

    
    
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
