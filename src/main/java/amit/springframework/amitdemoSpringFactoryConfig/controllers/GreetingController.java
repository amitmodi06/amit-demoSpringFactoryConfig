package amit.springframework.amitdemoSpringFactoryConfig.controllers;

import amit.springframework.amitdemoSpringFactoryConfig.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * created by KUAM on 4/23/2020
 */
@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String showGreeting(){
        return greetingService.sayGreeting();
    }
}
