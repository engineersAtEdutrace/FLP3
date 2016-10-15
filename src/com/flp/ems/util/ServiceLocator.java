package com.flp.ems.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ServiceLocator {
	
	static public DataSource getDataSource() throws NamingException{
		
		Context context = new InitialContext();
		Context ctx = (Context) context.lookup("java:/comp/env");
		
		DataSource ds = (DataSource) ctx.lookup("jdbc/EMSDataSource");
		
		return ds;
	}
}
