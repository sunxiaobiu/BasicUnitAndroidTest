import android.support.v4.view.MenuItemCompat;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_scsi_directwireless_dwtechtool_1857905755 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      MenuItemCompat.setShowAsAction((MenuItem)var0, 9);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
