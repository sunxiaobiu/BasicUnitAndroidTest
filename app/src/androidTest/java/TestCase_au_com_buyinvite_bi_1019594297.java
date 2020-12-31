import android.telephony.CellSignalStrength;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_buyinvite_bi_1019594297 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(CellSignalStrength.class);
      int var2 = ((CellSignalStrength)var1).getAsuLevel();
   }
}
