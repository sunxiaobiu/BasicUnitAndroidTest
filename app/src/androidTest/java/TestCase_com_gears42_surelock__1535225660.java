import android.nfc.NdefRecord;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__1535225660 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      NdefRecord var1 = NdefRecord.createMime("application/com.android.managedprovisioning", var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
