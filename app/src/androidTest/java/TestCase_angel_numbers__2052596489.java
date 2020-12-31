import android.location.LocationListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers__2052596489 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LocationListener.class);
      String var1 = "android";
      ((LocationListener)var2).onProviderEnabled(var1);
   }
}
