package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping(path ="/")
    public String homePage() {
        return "ADMIN";
    }

    @GetMapping(path = "/member")
    public Member member() {
        return new Member("ADMIN USER", "ADMIN");
    }
}
