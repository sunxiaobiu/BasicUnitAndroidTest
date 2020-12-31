import android.app.Activity;
import android.nfc.NfcAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_1989881415 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(NfcAdapter.class);
      Object var1 = null;
      ((NfcAdapter)var2).disableForegroundNdefPush((Activity)var1);
   }
}
