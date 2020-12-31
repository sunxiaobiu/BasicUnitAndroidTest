import android.nfc.Tag;
import android.nfc.tech.NfcV;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_as_android_mpost_g4s_airport__1863886120 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Tag.class);
      NfcV var1 = NfcV.get((Tag)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
