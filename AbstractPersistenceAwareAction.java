
/**
 * @author mgarber
 *
 */
public abstract class AbstractPersistenceAwareAction extends AbstractAction {

	private LoanApplicationPersistenceInterface persistenceService;

	/**
	 * @param persistenceService The persistenceService to set.
	 */
	public void setPersistenceService(LoanApplicationPersistenceInterface persistenceService) {
		this.persistenceService = persistenceService;
	}

	/**
	 * @return Returns the persistenceService.
	 */
	public LoanApplicationPersistenceInterface getPersistenceService() {
		return persistenceService;
	}
}
