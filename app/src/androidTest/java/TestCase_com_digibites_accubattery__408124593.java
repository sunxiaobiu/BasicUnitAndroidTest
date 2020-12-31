import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_digibites_accubattery__408124593 {
   public static void testCase() throws Exception {
      byte var2 = 1;
      long var0 = Os.sysconf(var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
