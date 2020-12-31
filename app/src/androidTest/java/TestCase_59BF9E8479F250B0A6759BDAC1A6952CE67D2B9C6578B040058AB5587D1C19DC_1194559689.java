import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59BF9E8479F250B0A6759BDAC1A6952CE67D2B9C6578B040058AB5587D1C19DC_1194559689 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = Os.readlink(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
