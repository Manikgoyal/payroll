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

/**
 *
 * @author manik
 */

@Entity
@Table(name = "group_permission",catalog = "hibernatedb")
@AssociationOverrides({
    @AssociationOverride(name = "pk2.groups",joinColumns = @JoinColumn(name = "id_groups")),
    @AssociationOverride(name = "pk2.permissions",joinColumns = @JoinColumn(name = "id_permissions"))
})
public class GroupPermissions implements Serializable{
    
    @EmbeddedId
    private GroupPermissionId pk2=new GroupPermissionId();
        private String status;

    public GroupPermissionId getPk2() {
        return pk2;
    }

    public void setPk2(GroupPermissionId pk2) {
        this.pk2 = pk2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

        
        
        
        
    
}
