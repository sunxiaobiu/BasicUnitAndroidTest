import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artsoft_KhayaamLegacy_app__2032247679 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      AppCompatTextView var3 = new AppCompatTextView(var1);
      byte var4 = 1;
      var3.setWidth(var4);
   }

   public TestCase_com_artsoft_KhayaamLegacy_app__2032247679() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
