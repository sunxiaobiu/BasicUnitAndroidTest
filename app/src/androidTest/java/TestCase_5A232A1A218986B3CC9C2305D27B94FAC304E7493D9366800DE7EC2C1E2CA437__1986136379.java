import android.app.Activity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A232A1A218986B3CC9C2305D27B94FAC304E7493D9366800DE7EC2C1E2CA437__1986136379 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      View var1 = var4.findViewById(2131230817);
      AppCompatEditText var2 = (AppCompatEditText)var1;
      var1 = var4.findViewById(2131230822);
      var1 = var4.findViewById(2131230816);
      var1 = var4.findViewById(2131230820);
      var1 = var4.findViewById(2131230821);
      String var5 = "android";
      var2.setError(var5);
   }

   public TestCase_5A232A1A218986B3CC9C2305D27B94FAC304E7493D9366800DE7EC2C1E2CA437__1986136379() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
