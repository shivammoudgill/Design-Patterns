package factory;

import Util.AccountType;
import account.Account;
import account.CurrentAccount;
import account.SavingsAccount;


public class AccountFactory implements Factory{
	public Account getAccount(AccountType type) {
		Account account = null;
		switch (type) {
		case CURRENT:
			account = new CurrentAccount();
			break;
		case SAVING:
			account = new SavingsAccount();
			break;
		default:
			account = new SavingsAccount();
			break;
		}
		return account;
		
	}
}
