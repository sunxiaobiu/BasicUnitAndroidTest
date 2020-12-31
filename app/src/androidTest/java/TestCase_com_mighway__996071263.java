import android.os.Environment;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_mighway__996071263 {
   public static void testCase() throws Exception {
      Object var0 = null;
      boolean var1 = Environment.isExternalStorageEmulated((File)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
