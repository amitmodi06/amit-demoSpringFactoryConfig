package amit.springframework.amitdemoSpringFactoryConfig.services;

import org.springframework.stereotype.Service;

/**
 * created by KUAM on 4/23/2020
 */
public class SpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public SpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
