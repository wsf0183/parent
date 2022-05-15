package com.wsf.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org/users/query/userinfo")
public class UserInfo {

    @GetMapping(value = "getUserName")
    String getUserName(@RequestParam() int userId) {
        return "testName";
    }
}
