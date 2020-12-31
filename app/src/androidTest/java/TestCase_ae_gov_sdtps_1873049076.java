import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_sdtps_1873049076 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Location.class);
      long var1 = 1L;
      ((Location)var3).setTime(var1);
   }
}
