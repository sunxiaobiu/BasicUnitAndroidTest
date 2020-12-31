import android.app.SearchableInfo;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aplabs_whatson_1631446971 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131689589);
      View var4 = var3.getActionView();
      SearchView var5 = (SearchView)var4;
      Object var1 = EasyMock.createMock(SearchableInfo.class);
      var5.setSearchableInfo((SearchableInfo)var1);
   }
}
