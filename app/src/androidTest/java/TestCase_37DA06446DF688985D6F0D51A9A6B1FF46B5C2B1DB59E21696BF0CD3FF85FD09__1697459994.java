import androidx.core.app.AppOpsManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_37DA06446DF688985D6F0D51A9A6B1FF46B5C2B1DB59E21696BF0CD3FF85FD09__1697459994 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = AppOpsManagerCompat.permissionToOp(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
