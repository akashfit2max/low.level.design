package com.akash.low.level.design.designpatterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Database database = new FileDatabase();
        Database encrypted = new EncryptionDecorator(database);
        System.out.println(encrypted.read());

        Database compress = new CompressionDecorator(database);
        Database encryt = new EncryptionDecorator(compress);
        System.out.println(encryt.read());
    }
}
