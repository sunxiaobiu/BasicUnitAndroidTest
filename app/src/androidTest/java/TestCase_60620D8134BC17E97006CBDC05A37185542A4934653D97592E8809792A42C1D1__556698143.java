import android.view.MenuItem;
import androidx.core.view.MenuItemCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_60620D8134BC17E97006CBDC05A37185542A4934653D97592E8809792A42C1D1__556698143 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      MenuItemCompat.expandActionView((MenuItem)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
