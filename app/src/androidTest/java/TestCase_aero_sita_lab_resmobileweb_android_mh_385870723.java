import android.content.Context;
import android.location.Geocoder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh_385870723 {
   @Test
   public void testCase() throws Exception {
      Context var6 = InstrumentationRegistry.getTargetContext();
      Geocoder var1 = new Geocoder(var6);
      double var2 = 1.0D;
      double var4 = 1.0D;
      var1.getFromLocation(var2, var4, 1);
   }
}
