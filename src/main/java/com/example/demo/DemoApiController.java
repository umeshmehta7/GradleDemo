package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApiController
{
    @GetMapping("/api/getDetails")
    @ResponseBody
    public String getDetails(@RequestParam String id)
    {
        return "Hello, "+id;
    }
}
