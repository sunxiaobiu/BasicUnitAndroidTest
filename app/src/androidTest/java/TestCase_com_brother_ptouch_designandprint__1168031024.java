import android.app.Activity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_brother_ptouch_designandprint__1168031024 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(16908306);
      FragmentTabHost var5 = (FragmentTabHost)var4;
      String var1 = "android";
      var5.setCurrentTabByTag(var1);
   }

   public TestCase_com_brother_ptouch_designandprint__1168031024() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
