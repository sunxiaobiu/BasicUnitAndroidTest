import android.support.v4.widget.CursorAdapter;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6148687E2C92F1719476A98D7307C0FF25198F1F27B5CAFF4874C788140F0F01_196785275 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Menu.class);
      MenuItem var2 = ((Menu)var1).findItem(2131296500);
      View var3 = var2.getActionView();
      SearchView var4 = (SearchView)var3;
      CursorAdapter var5 = var4.getSuggestionsAdapter();
   }
}
