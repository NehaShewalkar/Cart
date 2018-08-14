package main.java;

public class Item {

    private Article article;
    private int quantity;

    public Item(Article article, int quantity) throws NegativeValueException {
        this.article = article;
        if (quantity < 0) {
            throw new NegativeValueException("Negative item quantity");
        }
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantity() {
        return quantity;
    }
}
