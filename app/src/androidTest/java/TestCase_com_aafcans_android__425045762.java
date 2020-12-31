import android.nfc.NdefMessage;
import android.nfc.Tag;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aafcans_android__425045762 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Tag[].class);
      var1 = ((Object[])var1)[0];
      Ndef var2 = Ndef.get((Tag)var1);
      NdefMessage var3 = var2.getCachedNdefMessage();
   }
}
