import android.content.ContextWrapper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_1205252176 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContextWrapper.class);
      var2 = ((ContextWrapper)var2).getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      Object var1 = null;
      var3.listen((PhoneStateListener)var1, 0);
   }
}
