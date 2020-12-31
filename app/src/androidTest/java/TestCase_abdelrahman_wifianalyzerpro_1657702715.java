import android.os.Process;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro_1657702715 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      int var1 = Process.getThreadPriority(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
