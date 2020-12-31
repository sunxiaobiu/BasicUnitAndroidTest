import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1817D879B722E5112D90B0BF3BCB2A69E7A6BFA36CDB341FBF98A82CB780C6D1__1492046887 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TelephonyManager.class);
      SignalStrength var2 = ((TelephonyManager)var1).getSignalStrength();
   }
}
