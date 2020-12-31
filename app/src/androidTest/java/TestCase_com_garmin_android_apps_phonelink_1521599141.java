import android.hardware.GeomagneticField;
import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_garmin_android_apps_phonelink_1521599141 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Location.class);
      long var2 = ((Location)var1).getTime();
      double var4 = ((Location)var1).getAltitude();
      float var8 = (float)var4;
      var4 = ((Location)var1).getLongitude();
      float var6 = (float)var4;
      var4 = ((Location)var1).getLatitude();
      float var9 = (float)var4;
      GeomagneticField var7 = new GeomagneticField(var9, var6, var8, var2);
      var9 = var7.getFieldStrength();
   }
}
