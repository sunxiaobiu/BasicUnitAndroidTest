import android.hardware.GeomagneticField;
import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_underside_decathlon_molkky__595250147 {
   @Test
   public void testCase() throws Exception {
      Object var8 = EasyMock.createMock(Location.class);
      Object var1 = var8;
      long var2 = ((Location)var8).getTime();
      double var4 = ((Location)var8).getAltitude();
      float var9 = (float)var4;
      var4 = ((Location)var1).getLongitude();
      float var6 = (float)var4;
      var4 = ((Location)var1).getLatitude();
      float var10 = (float)var4;
      GeomagneticField var7 = new GeomagneticField(var10, var6, var9, var2);
      var9 = var7.getDeclination();
   }
}
