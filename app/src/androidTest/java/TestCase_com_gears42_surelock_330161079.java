import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.Iterator;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_330161079 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      PackageManager var4 = var3.getPackageManager();
      Intent var1 = new Intent("android.app.action.DEVICE_ADMIN_ENABLED", (Uri)null);
      List var5 = var4.queryBroadcastReceivers(var1, 0);
      Iterator var6 = var5.iterator();
      Object var7 = var6.next();
      ResolveInfo var8 = (ResolveInfo)var7;
      String var9 = var8.toString();
   }

   public TestCase_com_gears42_surelock_330161079() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
