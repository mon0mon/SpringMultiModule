package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping(path ="/")
    public String homePage() {
        return "WEB";
    }

    @GetMapping(path = "/member")
    public Member member() {
        return new Member("WEB USER", "WEB");
    }
}