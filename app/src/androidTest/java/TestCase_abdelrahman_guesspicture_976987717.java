import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_976987717 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = null;
      var4.removeUpdates((LocationListener)var1);
   }
}
