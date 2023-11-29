package com.akash.low.level.design.designpatterns.creational.singleton;

public class ConnectionPoolThreadSafe {

    // step 3 - add static variable
    private static ConnectionPoolThreadSafe connectionPool = null;

    // step 1 - hide const.
    private ConnectionPoolThreadSafe() {
    }

    // step - 2 static initializer
//    public synchronized static ConnectionPoolThreadSafe getConnectionPoolInstance() {
//        if (connectionPool == null) {
//            connectionPool = new ConnectionPoolThreadSafe(); // create if not present
//        }
//        return connectionPool;
//    }

    public static ConnectionPoolThreadSafe getConnectionPoolInstance() {
        if (connectionPool == null) {
            synchronized (ConnectionPool.class) {
                if (connectionPool == null) {
                    connectionPool = new ConnectionPoolThreadSafe(); // create if not present
                }
            }
        }
        return connectionPool;
    }

}

// Eager initialisation
// Lazy initialisation (on demand creation)
