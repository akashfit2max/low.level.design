package com.akash.low.level.design.designpatterns.Structural.Decorator;

public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(Database db) {
        super(db);
    }

    @Override
    public String read() {
        String actualValue = db.read();
        return decrypt(actualValue);
    }

    private String decrypt(String actualValue) {
        return actualValue + "- Decrupted";
    }

    @Override
    public void write(String input) {
        String encrypted = encrypt(input);
        db.write(encrypted);
    }

    private String encrypt(String input) {
        return input + "-Encrypted";
    }
}
