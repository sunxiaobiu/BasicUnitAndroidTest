import android.database.DatabaseUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_llamalab_automate_253090898 {
   public static void testCase() throws Exception {
      String var0 = "android";
      String var1 = "android";
      DatabaseUtils.concatenateWhere(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
