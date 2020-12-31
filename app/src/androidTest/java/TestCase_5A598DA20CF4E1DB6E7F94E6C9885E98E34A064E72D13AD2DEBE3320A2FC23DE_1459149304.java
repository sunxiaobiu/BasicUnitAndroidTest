import android.app.NotificationManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A598DA20CF4E1DB6E7F94E6C9885E98E34A064E72D13AD2DEBE3320A2FC23DE_1459149304 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("notification");
      NotificationManager var3 = (NotificationManager)var2;
      boolean var4 = var3.areNotificationsEnabled();
   }
}
