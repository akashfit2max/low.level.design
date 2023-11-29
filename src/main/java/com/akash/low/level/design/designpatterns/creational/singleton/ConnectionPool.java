package com.akash.low.level.design.designpatterns.creational.singleton;

public class ConnectionPool {

    // step 3 - add static variable
    private static ConnectionPool connectionPool = null;

    // step 1 - hide const.
    private ConnectionPool() {
    }

    // step - 2 static initializer
    public static ConnectionPool getConnectionPoolInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool(); // create if not present
        }
        return connectionPool;
    }

}

// Eager initialisation
// Lazy initialisation (on demand creation)
