import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture__1669872462 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Location.class);
      String var2 = ((Location)var1).getProvider();
   }
}
