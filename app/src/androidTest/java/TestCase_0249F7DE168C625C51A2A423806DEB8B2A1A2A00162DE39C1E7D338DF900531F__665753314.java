import android.app.AppOpsManager;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__665753314 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = AppOpsManager.permissionToOp(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
