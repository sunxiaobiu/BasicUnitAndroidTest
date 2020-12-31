import android.app.Activity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_atpc_232434147 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = EasyMock.createMock(Menu.class);
      MenuItem var4 = ((Menu)var3).findItem(2131296708);
      View var5 = var4.getActionView();
      SearchView var6 = (SearchView)var5;
      var5 = var6.findViewById(2131296717);
      SearchAutoComplete var7 = (SearchAutoComplete)var5;
      var7.setHint(2131624282);
   }

   public TestCase_com_atpc_232434147() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
