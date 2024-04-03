package com.akash.low.level.design.designpatterns.Structural.CompositeDS;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    // it can have a file or a directory
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name is - " + directoryName);
        fileSystemList.forEach(fileSystem -> {
            fileSystem.ls();
        });
    }
}
