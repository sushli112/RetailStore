package model;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long SerialVersionUID = 10l;
    private String ItemName;
    private String itemType;
    private Integer itemPrice;

    public Item(String itemName, String itemType, Integer itemPrice) {
        ItemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
