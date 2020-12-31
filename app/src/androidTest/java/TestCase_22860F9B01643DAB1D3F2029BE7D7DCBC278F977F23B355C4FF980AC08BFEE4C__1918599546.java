import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_22860F9B01643DAB1D3F2029BE7D7DCBC278F977F23B355C4FF980AC08BFEE4C__1918599546 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131298012);
      View var4 = MenuItemCompat.getActionView(var3);
      SearchView var5 = (SearchView)var4;
      Object var1 = EasyMock.createMock(OnFocusChangeListener.class);
      var5.setOnQueryTextFocusChangeListener((OnFocusChangeListener)var1);
   }
}
