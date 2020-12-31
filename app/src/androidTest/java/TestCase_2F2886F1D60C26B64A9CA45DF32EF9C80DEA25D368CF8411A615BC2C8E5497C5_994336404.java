import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2F2886F1D60C26B64A9CA45DF32EF9C80DEA25D368CF8411A615BC2C8E5497C5_994336404 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("notification");
      NotificationManager var3 = (NotificationManager)var2;
      List var4 = var3.getNotificationChannels();
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      NotificationChannel var6 = (NotificationChannel)var2;
      String var7 = var6.getGroup();
   }
}
