package com.akash.low.level.design.designpatterns.Structural.Decorator;

//step 4 - concrete decorator
public class CompressionDecorator extends BaseDecorator {
    public CompressionDecorator(Database db) {
        super(db);
    }

    @Override
    public String read() {
        String actualValue = db.read();
        return decompress(actualValue);
    }

    private String decompress(String actualValue) {
        return actualValue + "- Decompressed";
    }

    @Override
    public void write(String input) {
        String compressed = compress(input);
        db.write(compressed);
    }

    private String compress(String input) {
        return input + " - Compressed";
    }
}
