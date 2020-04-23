package amit.springframework.amitdemoSpringFactoryConfig.services;

import org.springframework.stereotype.Component;

/**
 * created by KUAM on 4/23/2020
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Spanish: Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "German: Primärer Grußdienst";

    }
}
