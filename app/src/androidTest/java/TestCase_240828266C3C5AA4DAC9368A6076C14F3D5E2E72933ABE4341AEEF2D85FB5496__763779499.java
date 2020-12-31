import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_240828266C3C5AA4DAC9368A6076C14F3D5E2E72933ABE4341AEEF2D85FB5496__763779499 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Os.kill(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
