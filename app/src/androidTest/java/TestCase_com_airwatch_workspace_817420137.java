import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_817420137 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      String var4 = var3.getMeid();
   }
}
