import android.content.Context;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1817D879B722E5112D90B0BF3BCB2A69E7A6BFA36CDB341FBF98A82CB780C6D1_158676233 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      List var4 = var3.getAllCellInfo();
      var1 = null;
      var2 = EasyMock.createMock(List.class);
      Iterator var5 = ((List)var2).iterator();
      var2 = var5.next();
      CellInfo var6 = (CellInfo)var2;
      CellInfoLte var7 = (CellInfoLte)var6;
      CellIdentityLte var8 = var7.getCellIdentity();
      int var9 = var8.getBandwidth();
   }
}
