import android.os.Environment;
import android.util.AtomicFile;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import java.io.FileInputStream;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aboutmycode_NotificationsOff_1378918768 {
   @Test
   public void testCase() throws Exception {
      File var2 = Environment.getDataDirectory();
      File var1 = new File(var2, "system");
      var2 = new File(var1, "appops.xml");
      AtomicFile var4 = new AtomicFile(var2);
      FileInputStream var3 = var4.openRead();
   }
}
