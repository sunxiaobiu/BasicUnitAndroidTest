import android.content.Context;
import android.location.LocationManager;
import android.location.GpsStatus.Listener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_sdtps_1791448110 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = null;
      var4.removeGpsStatusListener((Listener)var1);
   }
}
