package cn.xuqplus.sbcconfigclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbcConfigClientDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SbcConfigClientDemoApplication.class, args);
  }

  @Value("${a:a}")
  String a;

  @GetMapping("")
  public String a() {
    return a;
  }
}
