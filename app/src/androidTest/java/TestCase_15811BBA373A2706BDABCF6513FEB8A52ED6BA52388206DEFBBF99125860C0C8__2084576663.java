import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.ShareActionProvider.OnShareTargetSelectedListener;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_15811BBA373A2706BDABCF6513FEB8A52ED6BA52388206DEFBBF99125860C0C8__2084576663 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131297029);
      ActionProvider var4 = MenuItemCompat.getActionProvider(var3);
      ShareActionProvider var5 = (ShareActionProvider)var4;
      Object var1 = null;
      var5.setOnShareTargetSelectedListener((OnShareTargetSelectedListener)var1);
   }
}
