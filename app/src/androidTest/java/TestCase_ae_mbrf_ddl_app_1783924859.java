import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_mbrf_ddl_app_1783924859 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      Object var1 = null;
      MenuItemCompat.setOnActionExpandListener((MenuItem)var0, (OnActionExpandListener)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
