import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.NfcAdapter.ReaderCallback;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_opal_travel__369075643 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      Object var5 = var4.getSystemService("nfc");
      NfcManager var6 = (NfcManager)var5;
      NfcAdapter var7 = var6.getDefaultAdapter();
      Object var1 = EasyMock.createMock(Activity.class);
      Object var2 = EasyMock.createMock(ReaderCallback.class);
      var7.enableReaderMode((Activity)var1, (ReaderCallback)var2, 257, (Bundle)null);
   }
}
