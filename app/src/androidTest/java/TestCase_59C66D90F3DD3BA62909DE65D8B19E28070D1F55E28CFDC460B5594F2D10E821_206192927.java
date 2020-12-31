import android.accounts.AccountManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59C66D90F3DD3BA62909DE65D8B19E28070D1F55E28CFDC460B5594F2D10E821_206192927 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AccountManager var3 = AccountManager.get(var2);
      String var1 = "android";
      var3.invalidateAuthToken("com.google", var1);
   }
}
