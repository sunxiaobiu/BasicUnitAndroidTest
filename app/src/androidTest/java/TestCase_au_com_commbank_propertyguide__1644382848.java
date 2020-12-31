import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_propertyguide__1644382848 {
   @Test
   public void testCase() throws Exception {
      Location var2 = new Location("fromLocation");
      Object var1 = EasyMock.createMock(Location.class);
      var2.bearingTo((Location)var1);
   }
}
