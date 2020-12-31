import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_mbrf_ddl_app_1978106028 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      Object var1 = EasyMock.createMock(SearchView.class);
      MenuItemCompat.setActionView((MenuItem)var0, (View)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
