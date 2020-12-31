import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.util.Currency;
import android.os.LocaleList;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ba_mobile__2021208173 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Resources var2 = var1.getResources();
      Configuration var3 = var2.getConfiguration();
      LocaleList var4 = var3.getLocales();
      Locale var5 = var4.get(0);
      Currency var6 = Currency.getInstance(var5);
      String var7 = var6.getCurrencyCode();
   }
}
