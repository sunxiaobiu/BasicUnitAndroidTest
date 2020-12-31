import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthWcdma;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_pbk__272676123 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(CellInfo.class);
      CellInfoWcdma var2 = (CellInfoWcdma)var1;
      CellSignalStrengthWcdma var3 = var2.getCellSignalStrength();
      int var4 = var3.getAsuLevel();
   }
}
