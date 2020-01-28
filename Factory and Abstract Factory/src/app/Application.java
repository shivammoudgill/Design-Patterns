package app;


import Util.AccountType;
import Util.FactoryType;
import Util.LoggerType;
import account.Account;
import factory.AbstractFactory;
import factory.AccountFactory;
import factory.Factory;
import factory.LoggerFactory;
import logger.Logger;

public class Application {
	public static void main(String[] args) {
		
		//Accessing factory through AbstractFactory
		AbstractFactory factory = new AbstractFactory();
		Factory accountFactory = factory.getFactory(FactoryType.ACCOUNT);
		Account CurrentFactory = accountFactory.getAccount(AccountType.CURRENT);
		CurrentFactory.accountType();
		
		//Doing same without references(variables) also known as ON THE FLY object
		new AbstractFactory()
							.getFactory(FactoryType.ACCOUNT)
							.getAccount(AccountType.CURRENT)
							.accountType();
		
		//Accessing Classes and Functions from factory
		AccountFactory acFactory = new AccountFactory();
		Account currentaccount = acFactory.getAccount(AccountType.CURRENT);
		currentaccount.accountType();
		
		LoggerFactory loFactory = new LoggerFactory();
		Logger dbLogger = loFactory.getLogger(LoggerType.DB);
		dbLogger.log();
		
	}
}
