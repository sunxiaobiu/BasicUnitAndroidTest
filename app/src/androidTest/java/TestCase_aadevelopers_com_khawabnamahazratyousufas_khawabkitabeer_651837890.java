import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer_651837890 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TelephonyManager.class);
      CellLocation var2 = ((TelephonyManager)var1).getCellLocation();
      CdmaCellLocation var3 = (CdmaCellLocation)var2;
      int var4 = var3.getBaseStationLongitude();
   }
}
