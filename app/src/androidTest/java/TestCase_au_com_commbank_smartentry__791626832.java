import android.content.Context;
import android.nfc.NfcAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry__791626832 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      NfcAdapter var1 = NfcAdapter.getDefaultAdapter((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
