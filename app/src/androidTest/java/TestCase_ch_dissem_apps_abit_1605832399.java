import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_dissem_apps_abit_1605832399 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      Object var1 = EasyMock.createMock(Bundle.class);
      ContentResolver.removePeriodicSync((Account)var0, "ch.dissem.apps.abit.provider", (Bundle)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
