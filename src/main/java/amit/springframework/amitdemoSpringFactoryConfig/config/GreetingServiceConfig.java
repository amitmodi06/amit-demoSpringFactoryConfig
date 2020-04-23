package amit.springframework.amitdemoSpringFactoryConfig.config;

import amit.springframework.amitdemoSpringFactoryConfig.services.GreetingRepository;
import amit.springframework.amitdemoSpringFactoryConfig.services.GreetingService;
import amit.springframework.amitdemoSpringFactoryConfig.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * created by KUAM on 4/23/2020
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Profile({"default", "english"})
    GreetingService englishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("eng");
    }

    @Bean
    @Primary
    @Profile("german")
    GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("ger");
    }

    @Bean
    @Profile("spanish")
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("spa");
    }

}
