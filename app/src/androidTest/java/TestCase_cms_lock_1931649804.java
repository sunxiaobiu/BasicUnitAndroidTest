import android.os.Process;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cms_lock_1931649804 {
   public static void testCase() throws Exception {
      long var0 = Process.getElapsedCpuTime();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
