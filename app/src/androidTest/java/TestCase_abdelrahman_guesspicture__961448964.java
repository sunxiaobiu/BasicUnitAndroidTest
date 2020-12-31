import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture__961448964 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      List var4 = var3.getAllCellInfo();
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      CellInfo var6 = (CellInfo)var2;
      CellInfoGsm var7 = (CellInfoGsm)var6;
      CellSignalStrengthGsm var8 = var7.getCellSignalStrength();
      int var9 = var8.getLevel();
   }
}
