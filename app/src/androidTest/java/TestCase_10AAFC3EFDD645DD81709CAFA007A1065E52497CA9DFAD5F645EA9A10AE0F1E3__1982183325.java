import android.nfc.tech.MifareClassic;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_10AAFC3EFDD645DD81709CAFA007A1065E52497CA9DFAD5F645EA9A10AE0F1E3__1982183325 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(MifareClassic.class);
      byte var1 = 1;
      ((MifareClassic)var2).sectorToBlock(var1);
   }
}
