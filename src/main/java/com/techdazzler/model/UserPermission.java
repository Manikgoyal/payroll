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
@Table(name = "user_permission",catalog = "hibernatedb")
@AssociationOverrides({
    @AssociationOverride(name = "pk1.users",joinColumns = @JoinColumn(name = "id_users")),
    @AssociationOverride(name = "pk1.permissions",joinColumns = @JoinColumn(name = "id_permissions"))
})
public class UserPermission implements Serializable{
    
    @EmbeddedId
    private UserPermissionId pk1=new UserPermissionId();
  
        private String status;

    public UserPermissionId getPk1() {
        return pk1;
    }

    public void setPk1(UserPermissionId pk1) {
        this.pk1 = pk1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
        

    
}
