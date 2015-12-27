package cn.edu.bjtu.sad.util;

import java.sql.Connection;

/**
 * DBUtilAbstractFactory class description
 * This Class is the abstract Factory of DBUtilFactory.
 * @author sunshine
 */
public abstract class DBUtilAbstractFactory {
    public abstract Connection getMysqlConn();
    public abstract Connection getOracleConn();
    public abstract Connection getDB2Conn();
}
