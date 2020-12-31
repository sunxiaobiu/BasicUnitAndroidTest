import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.OnSuggestionListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_08C7128379FFE7EBFDF0832254E676EEB2F0E19B5063D130A94D3857F0FC23B0__1201788956 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Menu.class);
      MenuItem var3 = ((Menu)var2).findItem(2131296543);
      View var4 = var3.getActionView();
      SearchView var5 = (SearchView)var4;
      Object var1 = null;
      var5.setOnSuggestionListener((OnSuggestionListener)var1);
   }
}
