package com.akash.low.level.design.designpatterns.Structural.CompositeDS;

public class Main {

    // object inside object
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyFileDirectory = new Directory("Comedy");
        FileSystem hulchul = new File("hulchul");
        comedyFileDirectory.add(hulchul);
        movieDirectory.add(comedyFileDirectory);

        movieDirectory.ls();
    }
}
