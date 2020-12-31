import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5981C0AFAA88BBBAC4D5C577A4C59D147145269B3562BAC05C4A5960BF8173C2_47779868 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("notification");
      NotificationManager var4 = (NotificationManager)var3;
      NotificationChannel var5 = var4.getNotificationChannel("com.google.android.gms.availability");
      String var1 = "android";
      var5.setName(var1);
   }
}
