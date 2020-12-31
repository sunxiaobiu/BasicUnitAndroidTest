import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amadeus_cmt_client_android_819147080 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(16908290);
      ViewGroup var4 = (ViewGroup)var3;
      var3 = var4.findViewById(2131231179);
      Toolbar var5 = (Toolbar)var3;
      int var6 = var5.getMinimumHeight();
   }

   public TestCase_com_amadeus_cmt_client_android_819147080() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
