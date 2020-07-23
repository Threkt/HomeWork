package com.zzxx.shoot;

import java.awt.image.BufferedImage;
/*
这是超大号飞机
* */
public class XXLPlane extends FlyingObject implements Enemy, Award {
    protected XXLPlane(int x, int y, BufferedImage img, int life) {
        super(x, y, img, life);
    }

    @Override
    public int getAwardType() {
        return 0;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public void move() {

    }
}
