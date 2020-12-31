import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0710EA11185CEB02929A5ADC5B27C03984942F2B0E1DD058F5F96F766401BD6E_1899503399 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131296480);
      ActionProvider var4 = MenuItemCompat.getActionProvider(var3);
      ShareActionProvider var5 = (ShareActionProvider)var4;
      Object var1 = EasyMock.createMock(Intent.class);
      var5.setShareIntent((Intent)var1);
   }
}
