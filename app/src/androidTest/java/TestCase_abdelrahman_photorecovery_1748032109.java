import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1748032109 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = Uri.encode(var0, "@#&=*+-_.,:!?()/~'%");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
