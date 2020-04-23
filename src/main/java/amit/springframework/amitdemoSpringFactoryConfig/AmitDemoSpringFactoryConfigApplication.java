package amit.springframework.amitdemoSpringFactoryConfig;

import amit.springframework.amitdemoSpringFactoryConfig.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AmitDemoSpringFactoryConfigApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AmitDemoSpringFactoryConfigApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");

		System.out.println(controller.showGreeting());
	}

}
