
/**
 * @author mgarber
 *
 */
public class ValidIncomeExpenseRatioRule extends AbstractRule {


	private double validRatio;
	
	protected boolean makeDecision(Object arg) throws Exception {
		LoanApplication application = (LoanApplication) arg;
		if(( application.getExpences() / application.getIncome() ) < validRatio)
			return true;
		
		application.setStatus(LoanApplication.INVALID_INCOME_EXPENSE_RATIO);
		return false;
	}

	/**
	 * @param validRatio The validRatio to set.
	 */
	public void setValidRatio(double validRatio) {
		this.validRatio = validRatio;
	}


}
