import main.java.Article;
import main.java.Item;
import main.java.NegativeValueException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldHaveArticleAndItemQuantity() throws NegativeValueException {
        Article article = new Article("Banana", 10);
        int quantity = 2;
        Item item = new Item(article, quantity);
        assertEquals(article,item.getArticle());
        assertEquals(quantity,item.getQuantity());
    }

    @Test(expected = NegativeValueException.class)
    public void shouldThrowNegativeValueException() throws NegativeValueException {
        Article article = new Article("Banana", 10);
        int quantity = -2;
        Item item = new Item(article, quantity);
    }

    @Test
    public void shouldReturnCostOfItem() throws Exception {
        Article article = new Article("Banana", 10);
        int quantity = 2;
        Item item = new Item(article, quantity);
        assertEquals(20, item.cost());
    }


}
