import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E678507DF076C790CE1270181C3A2296168FF08F4822ABFF3272E6412D0D36A_1368220937 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Context var3 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var4 = NotificationManagerCompat.from(var3);
      var4.cancelAll();
   }

   public TestCase_1E678507DF076C790CE1270181C3A2296168FF08F4822ABFF3272E6412D0D36A_1368220937() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
