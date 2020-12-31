import android.content.Context;
import android.support.v4.content.PermissionChecker;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_037FD14206FC66ED3E70BCCFCCB9A8FA17CEBADB8616FA2D479D185C4911470F_563961794 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      int var1 = PermissionChecker.checkCallingOrSelfPermission((Context)var0, "android.permission.ACCESS_NETWORK_STATE");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
