import android.os.Process;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace__394722331 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Process.setThreadPriority(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
