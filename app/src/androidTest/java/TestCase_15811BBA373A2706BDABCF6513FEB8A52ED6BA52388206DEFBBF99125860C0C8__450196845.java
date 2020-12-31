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
public class TestCase_15811BBA373A2706BDABCF6513FEB8A52ED6BA52388206DEFBBF99125860C0C8__450196845 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Menu.class);
      MenuItem var2 = ((Menu)var1).findItem(2131297029);
      ActionProvider var3 = MenuItemCompat.getActionProvider(var2);
      ShareActionProvider var4 = (ShareActionProvider)var3;
      var4.setShareHistoryFileName("share_history.xml");
   }
}
