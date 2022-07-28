package com.example.mydatabase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "api/v1/users")
    public List<UserDTO> getUsers(Pageable pageable) {
        return userService.getUsers(pageable);
    }
}
