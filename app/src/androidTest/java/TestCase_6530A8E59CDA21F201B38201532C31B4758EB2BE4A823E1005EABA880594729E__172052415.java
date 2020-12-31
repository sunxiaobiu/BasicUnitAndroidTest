import android.content.Context;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6530A8E59CDA21F201B38201532C31B4758EB2BE4A823E1005EABA880594729E__172052415 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      var2 = var2.getApplicationContext();
      Builder var3 = new Builder(var2);
      boolean var1 = true;
      var3.setLocalOnly(var1);
   }
}
