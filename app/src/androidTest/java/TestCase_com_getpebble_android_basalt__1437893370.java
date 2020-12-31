import android.accounts.Account;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt__1437893370 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      List var1 = ContentResolver.getPeriodicSyncs((Account)var0, "com.getpebble.android.basalt.internal.provider");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
