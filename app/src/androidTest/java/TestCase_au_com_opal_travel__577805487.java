import android.app.Application;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_opal_travel__577805487 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Application.class);
      var1 = ((Application)var1).getSystemService("nfc");
      NfcManager var2 = (NfcManager)var1;
      NfcAdapter var3 = var2.getDefaultAdapter();
   }
}
