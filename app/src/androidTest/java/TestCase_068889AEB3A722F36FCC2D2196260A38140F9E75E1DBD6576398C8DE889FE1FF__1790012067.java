import android.view.MenuItem;
import android.view.View;
import androidx.core.view.MenuItemCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_068889AEB3A722F36FCC2D2196260A38140F9E75E1DBD6576398C8DE889FE1FF__1790012067 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      View var1 = MenuItemCompat.getActionView((MenuItem)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
