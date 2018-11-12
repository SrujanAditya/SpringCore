package module1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx =new ClassPathXmlApplicationContext(
				"spring.xml");
		App app = (App) ctx.getBean("app");
		app.logEvent("Some event for 1");
		app.logEvent("Some event for 2");
	}
	private void logEvent(String msg) {
		Client client = (Client)ctx.getBean("client");
		ConsoleEventLogger eventLogger = (ConsoleEventLogger)ctx.getBean("eventLogger");
		String message = msg.replaceAll(
				client.getId(), client.getFullName());
		eventLogger.logEvent(message);
	}
}
