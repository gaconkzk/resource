package com.tma.dc4b;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResourceApplication {

  @RequestMapping("/")
  @CrossOrigin(origins = "*", maxAge = 3600)
  public Message home() {
    return new Message("Hello World");
  }

  public static void main(String[] args) {
    SpringApplication.run(ResourceApplication.class, args);
  }
}

@Getter
@Setter
class Message {

  private String id = UUID.randomUUID().toString();
  private String content;

  public Message(String content) {
    this.content = content;
  }
}