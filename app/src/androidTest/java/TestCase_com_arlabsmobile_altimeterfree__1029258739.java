import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arlabsmobile_altimeterfree__1029258739 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Location.class);
      ((Location)var1).removeAltitude();
   }
}
