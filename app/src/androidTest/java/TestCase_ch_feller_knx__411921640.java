import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__411921640 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Menu.class);
      MenuBuilder var2 = (MenuBuilder)var1;
      var1 = null;
      ((MenuBuilder)var1).setOverrideVisibleItems(true);
   }
}
