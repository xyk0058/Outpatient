package cn.edu.bjtu.sad.util;

import java.sql.Connection;

/**
 * DBUtilAbstractFactory class description
 * This Class is the abstract Factory of DBUtilFactory.
 * @author sunshine
 */
public abstract class DBUtilAbstractFactory {
    public abstract Connection getConn();
}
