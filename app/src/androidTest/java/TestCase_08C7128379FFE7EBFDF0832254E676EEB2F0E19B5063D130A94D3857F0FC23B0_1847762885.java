import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_08C7128379FFE7EBFDF0832254E676EEB2F0E19B5063D130A94D3857F0FC23B0_1847762885 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = EasyMock.createMock(Menu.class);
      MenuItem var5 = ((Menu)var4).findItem(2131296543);
      View var6 = var5.getActionView();
      SearchView var7 = (SearchView)var6;
      CursorAdapter var8 = var7.getSuggestionsAdapter();
      Object var1 = null;
      var8.changeCursor((Cursor)var1);
   }

   public TestCase_08C7128379FFE7EBFDF0832254E676EEB2F0E19B5063D130A94D3857F0FC23B0_1847762885() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
