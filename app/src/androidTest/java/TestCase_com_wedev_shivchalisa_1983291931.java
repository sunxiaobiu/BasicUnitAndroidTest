import android.support.v7.view.menu.MenuItemWrapperICS;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_wedev_shivchalisa_1983291931 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MenuItem.class);
      MenuItemWrapperICS var2 = (MenuItemWrapperICS)var1;
      var2.setExclusiveCheckable(true);
   }
}
