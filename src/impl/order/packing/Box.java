/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl.order.packing;

import order.packing.IBox;

/**
 *
 * @author LuisPedroGomes8190701
 */
public class Box implements IBox {

    private final int depth;
    private final int height;
    private final int lenght;
    private final int volume;

    public Box(int depth, int height, int lenght, int volume) {
        this.depth = depth;
        this.height = height;
        this.lenght = lenght;
        this.volume = volume;
    }
    
    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public int getVolume() {
        return volume;
    }

}
