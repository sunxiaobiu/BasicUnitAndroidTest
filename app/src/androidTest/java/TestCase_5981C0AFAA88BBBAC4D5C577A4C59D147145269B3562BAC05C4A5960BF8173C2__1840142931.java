import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5981C0AFAA88BBBAC4D5C577A4C59D147145269B3562BAC05C4A5960BF8173C2__1840142931 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("notification");
      NotificationManager var3 = (NotificationManager)var2;
      NotificationChannel var4 = var3.getNotificationChannel("com.google.android.gms.availability");
      CharSequence var5 = var4.getName();
   }
}
