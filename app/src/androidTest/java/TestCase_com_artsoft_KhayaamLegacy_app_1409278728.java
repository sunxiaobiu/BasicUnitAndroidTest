import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artsoft_KhayaamLegacy_app_1409278728 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      AppCompatTextView var1 = new AppCompatTextView(var3);
      TextPaint var4 = var1.getPaint();
   }

   public TestCase_com_artsoft_KhayaamLegacy_app_1409278728() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
