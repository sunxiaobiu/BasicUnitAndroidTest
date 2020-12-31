import android.accounts.Account;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_health_lab_drink_water_tracker__783578945 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      String var1 = "android";
      ContentResolver.getIsSyncable((Account)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
