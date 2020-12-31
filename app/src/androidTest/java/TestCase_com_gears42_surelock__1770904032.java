import android.app.admin.SystemUpdatePolicy;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__1770904032 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      SystemUpdatePolicy.createWindowedInstallPolicy(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
