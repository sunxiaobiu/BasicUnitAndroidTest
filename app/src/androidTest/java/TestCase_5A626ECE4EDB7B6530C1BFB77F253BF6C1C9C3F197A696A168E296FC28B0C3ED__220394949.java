import android.app.Activity;
import android.app.NotificationManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED__220394949 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("notification");
      NotificationManager var4 = (NotificationManager)var3;
      boolean var5 = var4.isNotificationPolicyAccessGranted();
   }

   public TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED__220394949() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
