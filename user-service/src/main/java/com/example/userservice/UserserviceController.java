package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserserviceController {
  @GetMapping("/users")
  public List<Map<String, Object>> list() {
    return List.of(Map.of("id", 1, "name", "Alice1"), Map.of("id", 2, "name", "Bob"), Map.of("id", 3, "name", "uuBpK"));
  }
}
