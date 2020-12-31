import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_gamegos_solitale__1630253198 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      PackageManager var2 = var1.getPackageManager();
      ProviderInfo var3 = var2.resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
   }
}
