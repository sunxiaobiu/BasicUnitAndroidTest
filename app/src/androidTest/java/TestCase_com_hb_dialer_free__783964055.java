import android.content.Context;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hb_dialer_free__783964055 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("telecom");
      TelecomManager var4 = (TelecomManager)var3;
      Object var1 = EasyMock.createMock(PhoneAccountHandle.class);
      var4.getPhoneAccount((PhoneAccountHandle)var1);
   }
}
