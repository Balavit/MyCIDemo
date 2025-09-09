package com.example.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class OrderserviceApplicationTests {
  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void endpointShouldReturnData() {
    String body = this.restTemplate.getForObject("/orders", String.class);
    assertThat(body).contains("id");
  }
}
