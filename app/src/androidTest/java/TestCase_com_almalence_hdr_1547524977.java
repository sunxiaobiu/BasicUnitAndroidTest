import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_almalence_hdr_1547524977 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      PackageManager var4 = var3.getPackageManager();
      Intent var1 = new Intent("android.intent.action.SEND");
      List var5 = var4.queryIntentActivities(var1, 0);
      Iterator var6 = var5.iterator();
      Object var7 = var6.next();
      ResolveInfo var8 = (ResolveInfo)var7;
      var8.loadIcon(var4);
   }
}
