import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_pbk__1461984000 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(CellInfo.class);
      CellInfoCdma var2 = (CellInfoCdma)var1;
      CellSignalStrengthCdma var3 = var2.getCellSignalStrength();
      int var4 = var3.getCdmaDbm();
   }
}
