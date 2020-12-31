import android.telephony.gsm.GsmCellLocation;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_pbk__733262321 {
   @Test
   public void testCase() throws Exception {
      GsmCellLocation var3 = new GsmCellLocation();
      byte var1 = 1;
      byte var2 = 1;
      var3.setLacAndCid(var1, var2);
   }
}
