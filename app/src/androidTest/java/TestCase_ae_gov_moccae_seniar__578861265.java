import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar__578861265 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Menu.class);
      MenuItem var2 = ((Menu)var1).findItem(2131230984);
      View var3 = var2.getActionView();
      SearchView var4 = (SearchView)var3;
      var4.setMaxWidth(Integer.MAX_VALUE);
   }
}
