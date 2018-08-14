import main.java.Article;
import main.java.NegativeValueException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ArticleTest {

@Test
public void articleShouldHaveNameAndCost() throws NegativeValueException{
    String articleName = "Banana";
    int cost = 10;
    Article article = new Article(articleName, cost);
    assertEquals(articleName,article.getArticleName());
    assertEquals(cost,article.getCost());
}

@Test(expected = NegativeValueException.class)
public void articleShouldThrowExcpetionForNegativeCost() throws NegativeValueException{
    String articleName = "Banana";
    int cost = -10;
    new Article(articleName, cost);
}

}
