import android.content.Context;
import android.net.sip.SipManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CB1B2D465CB53AB92854CC02590F56C32AC2FE60BFEC60AFF201D067FFA1332__271245082 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      SipManager var3 = SipManager.newInstance(var2);
      String var1 = "android";
      var3.close(var1);
   }
}
