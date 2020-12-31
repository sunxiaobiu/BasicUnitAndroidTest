import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_anz_DigitalKey_1627845445 {
   public static void testCase() throws Exception {
      Os.symlink("/storage/sdcard1/", "/data/media/0/");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
