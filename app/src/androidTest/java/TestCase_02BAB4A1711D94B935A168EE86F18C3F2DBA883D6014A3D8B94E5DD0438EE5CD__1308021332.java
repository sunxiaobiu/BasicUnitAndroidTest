import android.accounts.Account;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02BAB4A1711D94B935A168EE86F18C3F2DBA883D6014A3D8B94E5DD0438EE5CD__1308021332 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      String var1 = "android";
      ContentResolver.setSyncAutomatically((Account)var0, var1, true);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
