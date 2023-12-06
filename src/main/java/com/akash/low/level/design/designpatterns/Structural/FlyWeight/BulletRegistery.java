package com.akash.low.level.design.designpatterns.Structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistery<TYPE, OBJECT_TYPE> {

    private Map<TYPE, OBJECT_TYPE> bulletMap = new HashMap<>();

    public void addBullet(TYPE bulletType, OBJECT_TYPE bullet) {
        bulletMap.put(bulletType, bullet);
    }

    public OBJECT_TYPE getBullet(TYPE bulletType) {
        return bulletMap.get(bulletType);
    }
}
