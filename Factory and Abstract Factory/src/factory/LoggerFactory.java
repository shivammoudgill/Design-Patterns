package factory;

import Util.LoggerType;
import logger.DBLogger;
import logger.FileLogger;
import logger.Logger;

public class LoggerFactory implements Factory{
	public Logger getLogger(LoggerType type) {
		Logger logger = null;
		switch (type) {
		case DB:
			logger = new DBLogger();
			break;
		case FILE:
			logger = new FileLogger();
			break;
		default:
			break;
		}
		return logger;
	}
}
