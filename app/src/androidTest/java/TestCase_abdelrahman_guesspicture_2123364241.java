import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_2123364241 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      List var4 = var3.getAllCellInfo();
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      CellInfo var6 = (CellInfo)var2;
      CellInfoWcdma var7 = (CellInfoWcdma)var6;
      CellSignalStrengthWcdma var8 = var7.getCellSignalStrength();
   }
}
