import android.net.sip.SipProfile;
import android.net.sip.SipProfile.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CB1B2D465CB53AB92854CC02590F56C32AC2FE60BFEC60AFF201D067FFA1332_1131548848 {
   @Test
   public void testCase() throws Exception {
      Builder var1 = new Builder("Permission", "127.0.0.1");
      SipProfile var2 = var1.build();
      String var3 = var2.getUriString();
   }
}
