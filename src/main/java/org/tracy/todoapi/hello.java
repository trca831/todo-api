package org.tracy.todoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class hello {
    @GetMapping("/hello")
    public String hello(@RequestParam (name = "name", defaultValue = "world") String name) {
        return "Hello,"  + name;
    }
}
