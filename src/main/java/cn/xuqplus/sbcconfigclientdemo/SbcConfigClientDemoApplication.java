package cn.xuqplus.sbcconfigclientdemo;

import cn.xuqplus.sbcconfigclientdemo.domain.User;
import cn.xuqplus.sbcconfigclientdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  UserRepository userRepository;

  @GetMapping("user")
  public String user() {
    if (!userRepository.existsById(1L)) {
      User user = new User();
      user.setName("hello, 世界");
      userRepository.save(user);
    }
    return userRepository.getOne(1L).toString();
  }
}
