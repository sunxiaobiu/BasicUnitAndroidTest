import android.support.v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_attendify_confue5qdk_416696306 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MenuItem.class);
      MenuItemImpl var2 = (MenuItemImpl)var1;
      boolean var3 = var2.isActionButton();
   }
}
