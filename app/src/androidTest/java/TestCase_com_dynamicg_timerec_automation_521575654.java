import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.NdefFormatable;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dynamicg_timerec_automation_521575654 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Parcelable var2 = ((Intent)var1).getParcelableExtra("android.nfc.extra.TAG");
      Tag var3 = (Tag)var2;
      NdefFormatable var4 = NdefFormatable.get(var3);
      var4.close();
   }
}
