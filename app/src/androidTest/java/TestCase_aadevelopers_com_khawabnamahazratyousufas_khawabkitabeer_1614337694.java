import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer_1614337694 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TelephonyManager.class);
      CellLocation var2 = ((TelephonyManager)var1).getCellLocation();
   }
}
