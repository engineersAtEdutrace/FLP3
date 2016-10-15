package com.flp.ems.dao;

public class JDBCDaoException extends Exception{

    public JDBCDaoException() {
        super();
    }

    public JDBCDaoException(String message) {
        super(message);
    }

    public JDBCDaoException(Throwable cause) {
        super(cause);
    }

    public JDBCDaoException(String message, Throwable cause) {
        super(message, cause);
    }

}
