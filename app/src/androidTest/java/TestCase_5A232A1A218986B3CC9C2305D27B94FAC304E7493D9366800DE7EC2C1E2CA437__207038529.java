import android.app.Activity;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A232A1A218986B3CC9C2305D27B94FAC304E7493D9366800DE7EC2C1E2CA437__207038529 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131230817);
      AppCompatEditText var4 = (AppCompatEditText)var3;
      Editable var5 = var4.getText();
   }

   public TestCase_5A232A1A218986B3CC9C2305D27B94FAC304E7493D9366800DE7EC2C1E2CA437__207038529() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
