import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mgarber
 *
 */
public class LoanProcessRuleEngine extends SpringRuleEngine {
	public static final SpringRuleEngine getEngine(String name) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringRuleEngineContext.xml");
		return (SpringRuleEngine) context.getBean(name);
	}
}
