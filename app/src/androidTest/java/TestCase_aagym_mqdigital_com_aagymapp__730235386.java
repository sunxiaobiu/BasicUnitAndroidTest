import android.content.Intent;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp__730235386 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131558742);
      ActionProvider var4 = MenuItemCompat.getActionProvider(var3);
      ShareActionProvider var5 = (ShareActionProvider)var4;
      Object var1 = EasyMock.createMock(Intent.class);
      var5.setShareIntent((Intent)var1);
   }
}
