/*
 * Created on 02.05.2022 by Kay Patzwald
 */
package de.oszimt.ls11a1.model.dao;

/**
 * Factory for the Data Access Object
 * @author Kay Patzwald
 */
public class DaoFactory {
	
	/** Returns an initialized Data Access Object
	 * @return {@link IDao}
	 */
	public static IDao get(String type) {
		switch (type) {
			//case "dummy":
				//return DaoImplementation.createDaoImplementation();
			default:
				return DaoDummyImplementation.createDaoDummyImplementation();
		}
	}
}
