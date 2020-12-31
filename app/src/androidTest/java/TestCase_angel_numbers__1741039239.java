import android.location.Location;
import android.location.LocationListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers__1741039239 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LocationListener.class);
      Object var1 = EasyMock.createMock(Location.class);
      ((LocationListener)var2).onLocationChanged((Location)var1);
   }
}
