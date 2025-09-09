package com.example.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderserviceController {
  @GetMapping("/orders")
  public List<Map<String, Object>> list() {
    return List.of(Map.of("id", 101, "item", "Widget", "qty", 2), Map.of("id", 102, "item", "Gadget", "qty", 1));
  }
}
