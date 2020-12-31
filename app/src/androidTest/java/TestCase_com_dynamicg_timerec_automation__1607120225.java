import android.nfc.NdefMessage;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dynamicg_timerec_automation__1607120225 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(NdefMessage.class);
      byte[] var2 = ((NdefMessage)var1).toByteArray();
   }
}
