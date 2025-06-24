package com.javaguides.thymleafejavaguides.controller;


import com.javaguides.thymleafejavaguides.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    //handle User registration page Request
    @GetMapping("register")
    public String userRegistration(Model model) {
        //Empty User FOrm model Object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> professionList = Arrays.asList("Developer", "Tester" ,"Architect");
        model.addAttribute("professionList", professionList);
        return "register-form";
    }

    //handler method to handle user registration form request
    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
