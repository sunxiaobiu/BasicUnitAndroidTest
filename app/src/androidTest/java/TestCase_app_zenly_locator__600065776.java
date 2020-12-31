import android.system.Os;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator__600065776 {
   public static void testCase() throws Exception {
      Object var0 = null;
      byte var1 = 1;
      Os.dup2((FileDescriptor)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
