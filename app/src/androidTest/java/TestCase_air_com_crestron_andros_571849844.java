import android.os.Debug;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_crestron_andros_571849844 {
   public static void testCase() throws Exception {
      long var0 = Debug.getNativeHeapFreeSize();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
