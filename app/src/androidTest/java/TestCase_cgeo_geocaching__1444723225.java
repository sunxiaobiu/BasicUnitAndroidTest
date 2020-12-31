import android.location.GpsStatus;
import android.location.LocationManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching__1444723225 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LocationManager.class);
      GpsStatus var2 = ((LocationManager)var1).getGpsStatus((GpsStatus)null);
      Iterable var3 = var2.getSatellites();
   }
}
