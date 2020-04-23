package amit.springframework.amitdemoSpringFactoryConfig.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * created by KUAM on 4/23/2020
 */
public class EnglishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public EnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
