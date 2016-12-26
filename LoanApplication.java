import java.util.Arrays;

/**
 * @author mgarber
 *
 */
public class LoanApplication {
	
	public static final String INVALID_STATE = "Sorry we are not doing business in your state";
	public static final String INVALID_INCOME_EXPENSE_RATIO = "Sorry we cannot provide the loan given this expense/income ratio";
	public static final String APPROVED = "Your application has been approved";
	public static final String INSUFFICIENT_DATA = "You did not provide enough information on your application";
	public static final String INPROGRESS = "in progress";
	
	public static final String[] STATUSES = 
		new String[] {
			INSUFFICIENT_DATA, INVALID_INCOME_EXPENSE_RATIO, INVALID_STATE, APPROVED, INPROGRESS
		};

	private String firstName;
	private String lastName;
	private double income;
	private double expences;
	private String stateCode;
	private String status;
	
	/**
	 * @param firstName The firstName to set.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return Returns the firstName.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param lastName The lastName to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return Returns the lastName.
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param income The income to set.
	 */
	public void setIncome(double income) {
		this.income = income;
	}
	/**
	 * @return Returns the income.
	 */
	public double getIncome() {
		return income;
	}
	/**
	 * @param expences The expences to set.
	 */
	public void setExpences(double expences) {
		this.expences = expences;
	}
	/**
	 * @return Returns the expences.
	 */
	public double getExpences() {
		return expences;
	}
	/**
	 * @param stateCode The stateCode to set.
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return Returns the stateCode.
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param status The status to set.
	 */
	public void setStatus(String status) {
		if(!Arrays.asList(STATUSES).contains(status))
			throw new IllegalArgumentException("invalid status:" + status);
		this.status = status;
	}
	/**
	 * @return Returns the status.
	 */
	public String getStatus() {
		return status;
	}
	
}
