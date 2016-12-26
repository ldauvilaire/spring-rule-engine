
/**
 * @author mgarber
 *
 */
public interface LoanApplicationPersistenceInterface {
	public void recordApproval(LoanApplication application) throws Exception;
	public void recordRejection(LoanApplication application) throws Exception;
	public void recordIncomplete(LoanApplication application) throws Exception;
}
