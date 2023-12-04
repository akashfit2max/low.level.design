package com.akash.low.level.design.designpatterns.Structural.FlyWeight;

public class Main {
    public static void main(String[] args) {
        Bullet bullet = new Bullet(BulletType.B_7MM, new Byte[100], "red", 12);
        FlyingBullet fb = FlyingBullet.builder().x(10).y(12).z(12).angle(12).build();
        FlyingBullet f2 = FlyingBullet.builder().x(10).y(12).z(12).angle(12).build();

        System.out.println(fb.getBullet() == f2.getBullet());
    }


}
