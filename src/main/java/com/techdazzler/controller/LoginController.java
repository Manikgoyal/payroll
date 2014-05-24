/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.controller;

import com.techdazzler.model.Users;
import com.techdazzler.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author manik
 */


@Controller
@RequestMapping
public class LoginController {
    
    @Autowired
    LoginService loginService;
    
    @RequestMapping("/")
    public String welcomePage(@ModelAttribute Users users){
        return "index";
    }
    @RequestMapping("/login")
    public String authenticateUser(@ModelAttribute Users users){
        loginService.save(users);
        return "index";
    }
    
    
    
}
