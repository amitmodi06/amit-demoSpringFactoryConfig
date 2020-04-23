package amit.springframework.amitdemoSpringFactoryConfig.services;

import org.springframework.stereotype.Service;

/**
 * created by KUAM on 4/23/2020
 */
public class GermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public GermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
