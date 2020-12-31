import android.telephony.SignalStrength;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1817D879B722E5112D90B0BF3BCB2A69E7A6BFA36CDB341FBF98A82CB780C6D1_495568520 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SignalStrength.class);
      int var2 = ((SignalStrength)var1).getGsmBitErrorRate();
   }
}
