import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import java.util.Locale;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biz_bsdapps_zmanihayom_zmanim__876558849 {
   @Test
   public void testCase() throws Exception {
      Locale var7 = Locale.getDefault();
      Context var1 = InstrumentationRegistry.getTargetContext();
      Geocoder var2 = new Geocoder(var1, var7);
      Object var10 = EasyMock.createMock(Location.class);
      double var3 = ((Location)var10).getLongitude();
      double var5 = ((Location)var10).getLatitude();
      List var8 = var2.getFromLocation(var5, var3, 1);
      Object var9 = var8.get(0);
      Address var11 = (Address)var9;
      String var12 = var11.getLocality();
   }
}
