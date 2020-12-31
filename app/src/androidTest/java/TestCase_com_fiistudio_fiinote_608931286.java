import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote_608931286 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var2 = new StringBuilder();
      String var3 = var2.toString();
      File var1 = new File(var3, "gestures");
      GestureLibrary var4 = GestureLibraries.fromFile(var1);
      var4.setOrientationStyle(8);
   }
}
