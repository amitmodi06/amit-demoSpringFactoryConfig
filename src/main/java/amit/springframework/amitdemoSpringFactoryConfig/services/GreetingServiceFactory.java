package amit.springframework.amitdemoSpringFactoryConfig.services;

/**
 * created by KUAM on 4/23/2020
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "eng":
                return new EnglishGreetingService(greetingRepository);
            case "ger":
                return new GermanGreetingService(greetingRepository);
            case "spa":
                return new SpanishGreetingService(greetingRepository);
             default:
                 return new EnglishGreetingService(greetingRepository);
        }
    }
}
