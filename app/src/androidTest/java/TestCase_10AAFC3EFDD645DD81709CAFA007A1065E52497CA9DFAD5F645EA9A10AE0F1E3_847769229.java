import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_10AAFC3EFDD645DD81709CAFA007A1065E52497CA9DFAD5F645EA9A10AE0F1E3_847769229 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Tag.class);
      MifareClassic var1 = MifareClassic.get((Tag)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
