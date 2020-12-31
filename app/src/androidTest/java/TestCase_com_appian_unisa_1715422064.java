import android.app.Activity;
import android.app.SearchManager;
import android.app.SearchManager.OnDismissListener;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appian_unisa_1715422064 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("search");
      SearchManager var5 = (SearchManager)var4;
      Object var1 = null;
      var5.setOnDismissListener((OnDismissListener)var1);
   }

   public TestCase_com_appian_unisa_1715422064() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
