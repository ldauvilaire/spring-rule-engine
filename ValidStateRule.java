import java.util.List;

/**
 * @author mgarber
 *
 */
public class ValidStateRule extends AbstractRule {

	private List validStates;
	
	protected boolean makeDecision(Object arg) throws Exception {
		LoanApplication application = (LoanApplication) arg;
		if(validStates.contains(application.getStateCode())) {
			return true;
		}
		application.setStatus(LoanApplication.INVALID_STATE);
		return false;
	}

	/**
	 * @param validStates The validStates to set.
	 */
	public void setValidStates(List validStates) {
		this.validStates = validStates;
	}


}
