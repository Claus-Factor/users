package com.enterprise.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/company")
    public List<User> getUsers(@RequestParam(value = "email", defaultValue = "default") String email) {
        return userService.getAllUsers();
    }

    @PostMapping("/company")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
