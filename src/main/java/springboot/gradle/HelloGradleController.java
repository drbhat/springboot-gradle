package springboot.gradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class HelloGradleController {

    @RequestMapping(path = "hello")
    public String helloGradle() {
        return "Hello Gradle!";
    }

}
