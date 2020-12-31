import android.content.Context;
import android.nfc.NfcAdapter;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry_194024216 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      NfcAdapter var2 = NfcAdapter.getDefaultAdapter(var1);
      boolean var3 = var2.isEnabled();
   }
}
