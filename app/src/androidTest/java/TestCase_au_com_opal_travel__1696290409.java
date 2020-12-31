import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_opal_travel__1696290409 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("nfc");
      NfcManager var5 = (NfcManager)var4;
      NfcAdapter var6 = var5.getDefaultAdapter();
      Object var1 = EasyMock.createMock(Activity.class);
      var6.disableReaderMode((Activity)var1);
   }
}
