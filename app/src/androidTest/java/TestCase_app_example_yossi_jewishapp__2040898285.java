import android.support.v4.view.MenuItemCompat;
import android.view.MenuItem;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_example_yossi_jewishapp__2040898285 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      View var1 = MenuItemCompat.getActionView((MenuItem)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
