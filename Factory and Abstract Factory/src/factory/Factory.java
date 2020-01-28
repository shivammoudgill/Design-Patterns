package factory;

import Util.AccountType;
import Util.LoggerType;
import account.Account;
import logger.Logger;

public interface Factory {
	default Account getAccount(AccountType type) {
		return null;
	}
	default Logger getLogger(LoggerType type) {
		return null;
	}
}
