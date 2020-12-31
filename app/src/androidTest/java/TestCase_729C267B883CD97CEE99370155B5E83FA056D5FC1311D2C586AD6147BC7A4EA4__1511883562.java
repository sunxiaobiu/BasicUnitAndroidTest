import android.app.Activity;
import android.content.pm.ShortcutManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_729C267B883CD97CEE99370155B5E83FA056D5FC1311D2C586AD6147BC7A4EA4__1511883562 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService(ShortcutManager.class);
   }

   public TestCase_729C267B883CD97CEE99370155B5E83FA056D5FC1311D2C586AD6147BC7A4EA4__1511883562() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
