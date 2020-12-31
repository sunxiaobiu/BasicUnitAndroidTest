import android.os.Environment;
import android.os.StatFs;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_RustyLake_CubeEscapeTheCave_872843293 {
   @Test
   public void testCase() throws Exception {
      File var4 = Environment.getRootDirectory();
      String var5 = var4.getAbsolutePath();
      StatFs var1 = new StatFs(var5);
      long var2 = var1.getAvailableBlocksLong();
   }
}
