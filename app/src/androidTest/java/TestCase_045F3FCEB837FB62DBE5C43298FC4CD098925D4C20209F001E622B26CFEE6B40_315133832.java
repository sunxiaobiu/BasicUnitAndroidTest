import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_045F3FCEB837FB62DBE5C43298FC4CD098925D4C20209F001E622B26CFEE6B40_315133832 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Menu.class);
      MenuItem var2 = ((Menu)var1).findItem(2131361855);
      View var3 = var2.getActionView();
      SearchView var4 = (SearchView)var3;
      var4.clearFocus();
   }
}
