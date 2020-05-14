package at.htl.turnier.controller;

import org.apache.derby.jdbc.ClientDataSource;

import javax.sql.DataSource;

public class DatasourceFactory {

    static final String username = "app";
    static final String password = "app";
    static final String db = "db";

    public static DataSource getDataSource() {
        ClientDataSource dataSource = new ClientDataSource();
        dataSource.setDatabaseName(db);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
