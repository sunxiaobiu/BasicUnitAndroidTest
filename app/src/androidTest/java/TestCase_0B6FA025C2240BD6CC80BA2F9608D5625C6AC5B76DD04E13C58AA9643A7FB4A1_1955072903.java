import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0B6FA025C2240BD6CC80BA2F9608D5625C6AC5B76DD04E13C58AA9643A7FB4A1_1955072903 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      List var4 = var3.getAllCellInfo();
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      CellInfo var6 = (CellInfo)var2;
      CellInfoCdma var7 = (CellInfoCdma)var6;
      CellSignalStrengthCdma var8 = var7.getCellSignalStrength();
      int var9 = var8.getEvdoDbm();
   }
}
