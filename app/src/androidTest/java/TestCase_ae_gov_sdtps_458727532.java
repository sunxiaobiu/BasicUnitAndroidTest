import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_sdtps_458727532 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Location.class);
      boolean var2 = ((Location)var1).hasAccuracy();
   }
}
