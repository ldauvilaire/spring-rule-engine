import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mgarber
 *
 */
public class SpringRuleEngine {
	
	private AbstractComponent firstStep;

	
	public void setFirstStep(AbstractComponent firstStep) {
		this.firstStep = firstStep;
	}

	public AbstractComponent getFirstStep() {
		return firstStep;
	}
	
	public void processRequest(Object arg) throws Exception {
		firstStep.execute(arg);
	}
	

}
