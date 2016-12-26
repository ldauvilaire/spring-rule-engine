/**
 * @author mgarber
 *
 */
public abstract class AbstractRule extends AbstractComponent {

	private AbstractComponent positiveOutcomeStep;
	private AbstractComponent negativeOutcomeStep;
	
	public void execute(Object arg) throws Exception {
		boolean outcome = makeDecision(arg);
		if(outcome)
			positiveOutcomeStep.execute(arg);
		else
			negativeOutcomeStep.execute(arg);
	}

	protected abstract boolean makeDecision(Object arg) throws Exception;

	/**
	 * @param positiveOutcomeStep The positiveOutcomeStep to set.
	 */
	public void setPositiveOutcomeStep(AbstractComponent positiveOutcomeStep) {
		this.positiveOutcomeStep = positiveOutcomeStep;
	}

	/**
	 * @return Returns the positiveOutcomeStep.
	 */
	public AbstractComponent getPositiveOutcomeStep() {
		return positiveOutcomeStep;
	}

	/**
	 * @param negativeOutcomeStep The negativeOutcomeStep to set.
	 */
	public void setNegativeOutcomeStep(AbstractComponent negativeOutcomeStep) {
		this.negativeOutcomeStep = negativeOutcomeStep;
	}

	/**
	 * @return Returns the negativeOutcomeStep.
	 */
	public AbstractComponent getNegativeOutcomeStep() {
		return negativeOutcomeStep;
	}
}
