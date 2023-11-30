package com.akash.low.level.design.designpatterns.creational.prototype;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
// step 2 - creat a sub class which implements
public class BackgroundObject implements GraphicalObject {

    private int x;
    private int y;
    private int width;
    private int height;
    private String color;
    private GraphicalObjectType graphicalObjectType;

    // hiding internal imp
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Integer> pixels = new ArrayList<>();

    public BackgroundObject(int x, int y, int width, int height, String color, GraphicalObjectType graphicalObjectType) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.graphicalObjectType = graphicalObjectType;
        this.pixels = someheavyMethod();
    }

    private List<Integer> someheavyMethod() {
        return Collections.emptyList();
    }

    // step 3 - clone the
    @Override
    public BackgroundObject clone() {
        BackgroundObject bobj = new BackgroundObject();
        bobj.x = this.x;
        bobj.y = this.y;
        bobj.width = this.width;
        bobj.height = this.height;
        bobj.color = this.color;
        bobj.pixels = this.pixels;
        return bobj;
    }
}
