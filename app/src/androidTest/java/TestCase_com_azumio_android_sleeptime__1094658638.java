import android.app.Activity;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_azumio_android_sleeptime__1094658638 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131755226);
      Toolbar var4 = (Toolbar)var3;
      Menu var5 = var4.getMenu();
      MenuItem var6 = var5.findItem(2131756708);
      var3 = MenuItemCompat.getActionView(var6);
      SearchView var7 = (SearchView)var3;
      String var8 = var7.toString();
   }

   public TestCase_com_azumio_android_sleeptime__1094658638() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
