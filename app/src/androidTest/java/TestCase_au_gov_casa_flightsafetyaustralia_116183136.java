import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_casa_flightsafetyaustralia_116183136 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      AccountManager var2 = AccountManager.get(var1);
      AuthenticatorDescription[] var3 = var2.getAuthenticatorTypes();
   }
}
