import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching__793182 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LocationManager.class);
      GpsStatus var2 = ((LocationManager)var1).getGpsStatus((GpsStatus)null);
      Iterable var3 = var2.getSatellites();
      Iterator var4 = var3.iterator();
      var1 = var4.next();
      GpsSatellite var5 = (GpsSatellite)var1;
      boolean var6 = var5.usedInFix();
   }
}
