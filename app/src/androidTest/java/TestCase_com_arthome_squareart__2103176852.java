import android.support.v4.app.AppOpsManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arthome_squareart__2103176852 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = AppOpsManagerCompat.permissionToOp(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
