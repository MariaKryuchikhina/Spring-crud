package com.spring.mvc.controller;

import com.spring.mvc.entity.User;
import com.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showAllUsers(Model model){

        List<User> allUsers = userService.getAllUser();
        model.addAttribute("allUsers", allUsers);

        return "all-user";
    }

    @RequestMapping("/addNewUser")
    public String addNewUser(Model model){

        User user = new User();
        model.addAttribute("user", user);
        return "add-user";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult){

        if (!bindingResult.hasErrors()) {
            userService.saveUser(user);
            return "redirect:/";
        } else {
            return "add-user";
        }
    }

    @RequestMapping("/updateInfo")
    public String updateUser(@RequestParam("usersId") int id, Model model){

        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "add-user";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("usersId") int id){

        userService.deleteUser(id);

        return "redirect:/";
    }
}
