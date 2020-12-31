import android.app.Activity;
import android.content.Intent;
import android.net.http.SslCertificate;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tux_client__137805151 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      Bundle var4 = var3.getBundleExtra("CertInfo");
      SslCertificate var5 = SslCertificate.restoreState(var4);
      String var6 = var5.getValidNotAfter();
   }

   public TestCase_com_tux_client__137805151() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
