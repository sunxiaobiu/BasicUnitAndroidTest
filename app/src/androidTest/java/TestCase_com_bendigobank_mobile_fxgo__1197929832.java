import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bendigobank_mobile_fxgo__1197929832 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Tag.class);
      IsoDep var1 = IsoDep.get((Tag)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
