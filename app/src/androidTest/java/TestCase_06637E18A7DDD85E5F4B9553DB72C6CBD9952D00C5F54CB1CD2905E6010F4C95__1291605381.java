import android.content.Context;
import androidx.core.content.PermissionChecker;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_06637E18A7DDD85E5F4B9553DB72C6CBD9952D00C5F54CB1CD2905E6010F4C95__1291605381 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      int var1 = PermissionChecker.checkSelfPermission((Context)var0, "com.google.android.providers.gsf.permission.READ_GSERVICES");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
