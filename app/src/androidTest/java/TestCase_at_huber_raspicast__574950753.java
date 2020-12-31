import android.os.Process;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_huber_raspicast__574950753 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Process.sendSignal(var0, 15);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
