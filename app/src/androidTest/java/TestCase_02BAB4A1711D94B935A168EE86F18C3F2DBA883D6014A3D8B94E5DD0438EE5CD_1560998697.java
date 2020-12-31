import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02BAB4A1711D94B935A168EE86F18C3F2DBA883D6014A3D8B94E5DD0438EE5CD_1560998697 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      String var1 = "android";
      Object var2 = EasyMock.createMock(Bundle.class);
      ContentResolver.requestSync((Account)var0, var1, (Bundle)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
