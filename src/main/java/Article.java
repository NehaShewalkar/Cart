package main.java;

public class Article {
    private String articleName;
    private int cost;

    public Article(String articleName, int cost) throws NegativeValueException {
        this.articleName = articleName;
        if (cost < 0) {
            throw new NegativeValueException("Negative cost");
        }
        this.cost = cost;
    }

    public String getArticleName() {
        return articleName;
    }

    public int getCost() {
        return cost;
    }
}
