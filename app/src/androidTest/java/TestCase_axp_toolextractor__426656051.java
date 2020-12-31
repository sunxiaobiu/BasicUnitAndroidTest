import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_axp_toolextractor__426656051 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131361862);
      View var4 = MenuItemCompat.getActionView(var3);
      SearchView var5 = (SearchView)var4;
      Object var1 = null;
      var5.setOnQueryTextFocusChangeListener((OnFocusChangeListener)var1);
   }
}
