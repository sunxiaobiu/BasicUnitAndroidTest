import android.app.ActionBar;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_thesmartbusinessclinic_horsetrackslite__325544262 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      ActionBar var5 = var4.getActionBar();
      Object var1 = EasyMock.createMock(View.class);
      Object var2 = EasyMock.createMock(LayoutParams.class);
      var5.setCustomView((View)var1, (LayoutParams)var2);
   }

   public TestCase_au_com_thesmartbusinessclinic_horsetrackslite__325544262() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
