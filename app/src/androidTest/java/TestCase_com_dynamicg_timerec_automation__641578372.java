import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.Tag;
import android.nfc.tech.NdefFormatable;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dynamicg_timerec_automation__641578372 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Intent.class);
      Parcelable var3 = ((Intent)var2).getParcelableExtra("android.nfc.extra.TAG");
      Tag var4 = (Tag)var3;
      NdefFormatable var5 = NdefFormatable.get(var4);
      Object var1 = EasyMock.createMock(NdefMessage.class);
      var5.format((NdefMessage)var1);
   }
}
