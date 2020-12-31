import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_shakthifm__310044008 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("connectivity");
      ConnectivityManager var4 = (ConnectivityManager)var3;
      NetworkInfo var5 = var4.getActiveNetworkInfo();
      boolean var6 = var5.isConnected();
   }

   public TestCase_abdelrahman_shakthifm__310044008() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
