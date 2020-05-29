/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl.order.packing;

import order.packing.IItem;


/**
 *
 * @author LuisPedroGomes8190701
 */
public class Item extends Box implements IItem {

    private final String reference;
    private String description;

    public Item(String reference, String description, int depth, int height, int lenght, int volume) {
        super(depth, height, lenght, volume);
        this.reference = reference;
        this.description = description;
    }
    
    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getDepth() {
        return super.getDepth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getLenght() {
        return super.getLenght();
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

}
