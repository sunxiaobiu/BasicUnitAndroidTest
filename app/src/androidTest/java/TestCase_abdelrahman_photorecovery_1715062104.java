import android.os.Environment;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1715062104 {
   public static void testCase() throws Exception {
      boolean var0 = Environment.isExternalStorageRemovable();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
