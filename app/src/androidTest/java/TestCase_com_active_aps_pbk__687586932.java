import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_pbk__687586932 {
   public static void testCase() throws Exception {
      String var0 = "android";
      Os.chmod(var0, 436);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
