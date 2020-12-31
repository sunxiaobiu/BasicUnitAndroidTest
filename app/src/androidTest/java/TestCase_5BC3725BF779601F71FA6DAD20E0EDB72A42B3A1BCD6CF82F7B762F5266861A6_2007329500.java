import androidx.appcompat.widget.SearchView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BC3725BF779601F71FA6DAD20E0EDB72A42B3A1BCD6CF82F7B762F5266861A6_2007329500 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SearchView.class);
      String var1 = "android";
      ((SearchView)var2).setQuery(var1, false);
   }
}
