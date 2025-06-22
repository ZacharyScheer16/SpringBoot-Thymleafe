package com.javaguides.thymleafejavaguides.controller;

import com.javaguides.thymleafejavaguides.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //Handler method to handle variable expression request

    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Zach", "zscheer000@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //handle method to handle selection expressions
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Brooklyn", "BrooklyBlum@gmail.com", "ADMIN", "female");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handle method to handle message espressions request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }

    // handle method to handle link expressions
    // http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handle method to handle fragment expression request
    // http://localhost:8080/fragment-expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
    @GetMapping("users")
    public String users(Model model){
        User admin = new User("John", "Jphnny@gmail.com", "ADMIN", "male");
        User zach = new User("Zach", "Zach@gmail.com", "USER", "male");
        User meena = new User("Meena", "Meena@gmail.com", "ADMIN", "female");
        List<User> users = new ArrayList<User>();
        users.add(admin);
        users.add(zach);
        users.add(meena);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        User admin = new User("John", "Jphnny@gmail.com", "ADMIN", "male");
        User zach = new User("Zach", "Zach@gmail.com", "USER", "male");
        User meena = new User("Meena", "Meena@gmail.com", "ADMIN", "female");
        List<User> users = new ArrayList<User>();
        users.add(admin);
        users.add(zach);
        users.add(meena);
        model.addAttribute("users", users);
        return "if-unless";
    }
}
