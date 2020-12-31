import android.content.Context;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_1248532314 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("location");
      LocationManager var5 = (LocationManager)var4;
      Object var1 = EasyMock.createMock(Criteria.class);
      Object var2 = null;
      var5.requestSingleUpdate((Criteria)var1, (LocationListener)var2, (Looper)null);
   }
}
