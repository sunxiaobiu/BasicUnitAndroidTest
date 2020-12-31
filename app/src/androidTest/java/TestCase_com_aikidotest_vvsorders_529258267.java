import android.app.Activity;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.os.Parcelable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aikidotest_vvsorders_529258267 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      Parcelable var4 = var3.getParcelableExtra("device");
      UsbDevice var5 = (UsbDevice)var4;
      String var6 = var5.getDeviceName();
   }

   public TestCase_com_aikidotest_vvsorders_529258267() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
