import android.telephony.CellIdentityCdma;
import android.telephony.CellInfoCdma;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_amdeveloper_designs_767620147 {
   @Test
   public void testCase() throws Exception {
      CellInfoCdma var1 = null;
      var1 = (CellInfoCdma)var1;
      CellIdentityCdma var2 = var1.getCellIdentity();
      int var3 = var2.getBasestationId();
   }
}
