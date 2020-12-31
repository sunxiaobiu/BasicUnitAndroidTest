import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching_2034886514 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Bundle var2 = ((Intent)var1).getExtras();
      Parcelable[] var3 = var2.getParcelableArray("android.nfc.extra.NDEF_MESSAGES");
      Parcelable var4 = var3[0];
      NdefMessage var5 = (NdefMessage)var4;
      NdefRecord[] var6 = var5.getRecords();
   }
}
