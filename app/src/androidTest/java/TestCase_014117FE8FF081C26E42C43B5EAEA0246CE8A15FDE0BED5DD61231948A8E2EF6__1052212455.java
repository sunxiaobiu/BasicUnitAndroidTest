import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__1052212455 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(CellInfo.class);
      CellInfoWcdma var2 = (CellInfoWcdma)var1;
      boolean var3 = var2.isRegistered();
   }
}
