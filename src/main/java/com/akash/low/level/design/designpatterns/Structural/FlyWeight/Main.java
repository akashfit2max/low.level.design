package com.akash.low.level.design.designpatterns.Structural.FlyWeight;

public class Main {
    public static void main(String[] args) {
        BulletRegistery<BulletType, Bullet> bulletRegistery = new BulletRegistery();
        Bullet bullet = new Bullet(BulletType.B_7MM, new Byte[100], "red", 12);
        Bullet bullet2 = new Bullet(BulletType.B_9MM, new Byte[100], "blue", 22);
        bulletRegistery.addBullet(BulletType.B_7MM, bullet);
        bulletRegistery.addBullet(BulletType.B_9MM, bullet2);

        FlyingBullet fb = FlyingBullet.builder().x(10).y(12).z(12).angle(12).build();
        FlyingBullet f2 = FlyingBullet.builder().x(10).y(12).z(12).angle(12).build();

        System.out.println(fb.getBullet() == f2.getBullet()); // the bullet object is common in both the objects
    }


}
