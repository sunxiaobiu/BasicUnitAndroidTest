import android.content.IntentFilter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_liven_android_247031047 {
   @Test
   public void testCase() throws Exception {
      IntentFilter var2 = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
      String var1 = "android";
      var2.addDataPath(var1, 1);
   }
}
