import android.location.Location;
import android.location.LocationManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_exatools_barometerandaltimeter_261345544 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LocationManager.class);
      Object var1 = EasyMock.createMock(Location.class);
      ((LocationManager)var2).setTestProviderLocation("gps", (Location)var1);
   }
}
