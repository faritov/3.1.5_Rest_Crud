package com.example.REST.controller;

import com.example.REST.model.User;
import com.example.REST.service.RoleService;
import com.example.REST.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;
    private final RoleService roleService;

    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;

    }

    @GetMapping
    public String getUser(Model model, Authentication authentication) {
        model.addAttribute("userList", userService.getAllUsers());
        User user = (User) authentication.getPrincipal();
        model.addAttribute("user", user);
        model.addAttribute("roleList", roleService.getList());
        model.addAttribute("users", userService.showUser(user.getId()));

        return "admin";
    }
}
