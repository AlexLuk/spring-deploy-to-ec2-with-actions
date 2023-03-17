package com.example.springdeploytoec2withactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greetings")
@RestController
public class GreetingController {

  @GetMapping
  public String getGreeting() {
    return "Hello World!";
  }
}
