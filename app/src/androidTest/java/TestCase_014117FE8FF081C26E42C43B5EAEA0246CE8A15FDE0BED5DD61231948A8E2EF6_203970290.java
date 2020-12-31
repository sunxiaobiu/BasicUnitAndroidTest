import android.app.NotificationManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6_203970290 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("notification");
      NotificationManager var5 = (NotificationManager)var4;
      String var1 = "android";
      byte var2 = 1;
      var5.cancel(var1, var2);
   }
}
