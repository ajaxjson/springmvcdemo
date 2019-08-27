package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.entities.User;
import com.utilities.UserListContainer;

@Controller
public class UserController {
    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{
        List<User> users = getListOfUsers();
        UserListContainer userList = new UserListContainer();
        userList.setUsers(users);
        model.addAttribute("Users", userList);
        return "showUsers";
    }
    
    @RequestMapping(value = "/getUsersfrm", method = RequestMethod.GET)
    public String getUsersfrm(Model model) throws Exception{
        List<User> users = getListOfUsers();
        UserListContainer userList = new UserListContainer();
        userList.setUsers(users);
        model.addAttribute("Users", userList);
        return "showUsersForm";
    }
    
    // Dummy method for adding List of Users
    private List<User> getListOfUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Jack", "Reacher", "abc@xyz.com"));
        users.add(new User("Remington", "Steele", "rs@cbd.com"));
        users.add(new User("Jonathan", "Raven", "jr@sn.com"));
        return users;
    }
    
}