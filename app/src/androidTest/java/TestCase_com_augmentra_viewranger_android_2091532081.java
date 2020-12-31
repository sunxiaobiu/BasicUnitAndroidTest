import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationProvider;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_augmentra_viewranger_android_2091532081 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = EasyMock.createMock(Location.class);
      String var5 = ((Location)var1).getProvider();
      LocationProvider var6 = var4.getProvider(var5);
      String var7 = var6.getName();
   }
}
