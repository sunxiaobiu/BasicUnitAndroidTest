import android.content.Context;
import android.os.UserManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm_1290497060 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("user");
      UserManager var3 = (UserManager)var2;
      boolean var4 = var3.hasUserRestriction("no_modify_accounts");
   }
}
