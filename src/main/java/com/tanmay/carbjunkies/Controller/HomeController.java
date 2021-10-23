package com.tanmay.carbjunkies.Controller;

import com.tanmay.carbjunkies.Model.RecipeModel;
import com.tanmay.carbjunkies.Service.RecipeService;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Iterator;

@Controller
public class HomeController {

    @GetMapping({"/","/home"})
    public String homePage()
    {
        return "index";
    }

}
