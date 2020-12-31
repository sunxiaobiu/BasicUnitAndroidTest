import android.content.Context;
import android.support.v4.content.PermissionChecker;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cn_com_sina_finance_1694893262 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = null;
      byte var2 = 1;
      String var3 = "android";
      PermissionChecker.checkPermission((Context)var1, "android.permission.READ_PHONE_STATE", var0, var2, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
