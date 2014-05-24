/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.service;

import com.techdazzler.dao.LoginDao;
import com.techdazzler.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author manik
 */

@Service
@Transactional
public class LoginServiceImlp implements LoginService{

    @Autowired
    LoginDao loginDao;
    
    public void save(Users users) {
        loginDao.save(users);
    }
    
}
