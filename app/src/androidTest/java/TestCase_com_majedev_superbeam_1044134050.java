import android.nfc.NdefRecord;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_majedev_superbeam_1044134050 {
   public static void testCase() throws Exception {
      String var0 = "android";
      NdefRecord var1 = NdefRecord.createApplicationRecord(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
