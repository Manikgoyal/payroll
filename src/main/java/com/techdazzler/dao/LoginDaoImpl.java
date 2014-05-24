/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.dao;

import com.techdazzler.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author manik
 */
@Repository
public class LoginDaoImpl implements LoginDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    public void save(Users users) {
        getCurrentSession().save(users);
    }
    
    
}
