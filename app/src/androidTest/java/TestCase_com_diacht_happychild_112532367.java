import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_diacht_happychild_112532367 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      Object var1 = EasyMock.createMock(ShareActionProvider.class);
      MenuItemCompat.setActionProvider((MenuItem)var0, (ActionProvider)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
