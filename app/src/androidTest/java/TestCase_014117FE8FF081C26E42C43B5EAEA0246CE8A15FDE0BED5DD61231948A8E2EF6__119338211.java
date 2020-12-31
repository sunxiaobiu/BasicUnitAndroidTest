import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__119338211 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(CellInfo.class);
      CellInfoLte var4 = (CellInfoLte)var3;
      long var1 = var4.getTimeStamp();
   }
}
