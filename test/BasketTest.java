import main.java.Article;
import main.java.Basket;
import main.java.Item;
import main.java.NegativeValueException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    @Test
    public void shouldhaveListOfItems() throws NegativeValueException {
        Article banana = new Article("Banana", 10);
        Article apple = new Article("apple", 20);
        Item itemBanana = new Item(banana, 2);
        Item itemApple = new Item(apple, 3);
        List<Item> itemList= Arrays.asList(itemBanana,itemApple);
        Basket basket=new Basket(itemList);
        assertEquals(itemList,basket.getItemList());

    }
    @Test
    public void shouldCalculateCost() throws NegativeValueException {
        Article banana = new Article("Banana", 10);
        Article apple = new Article("apple", 20);
        Item itemBanana = new Item(banana, 2);
        Item itemApple = new Item(apple, 3);
        List<Item> itemList= Arrays.asList(itemBanana,itemApple);
        Basket basket=new Basket(itemList);
        assertEquals(80,basket.calculate());
    }

    @Test
    public void shouldCalculateCostFor3Grapes() throws NegativeValueException {
        Article grapes = new Article("Grapes", 30);
        Item itemGrapes = new Item(grapes, 3);
        List<Item> itemList= Arrays.asList(itemGrapes);
        Basket basket=new Basket(itemList);
        assertEquals(90,basket.calculate());
    }

    @Test(expected = NegativeValueException.class)
    public void shouldThrowExceptionForNegativeQuantity() throws NegativeValueException {
        Article grapes = new Article("Grapes", 30);
        Item itemGrapes = new Item(grapes, -3);
        List<Item> itemList= Arrays.asList(itemGrapes);
        Basket basket=new Basket(itemList);
        assertEquals(90,basket.calculate());
    }
}
