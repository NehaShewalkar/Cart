package main.java;

import java.util.List;

public class Basket {

    private List<Item> itemList;

    public Basket(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemList() {
        return itemList;
    }


    public int calculate() {
        int costTotal = 0;
        for (Item item : itemList) {
            costTotal += item.getQuantity() * item.getArticle().getCost();
        }
        return costTotal;
    }
}
