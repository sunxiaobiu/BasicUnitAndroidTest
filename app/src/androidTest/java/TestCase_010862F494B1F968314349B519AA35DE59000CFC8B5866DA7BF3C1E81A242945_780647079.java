import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945_780647079 {
   @Test
   public void testCase() throws Exception {
      Location var2 = new Location("foo");
      Object var1 = EasyMock.createMock(Location.class);
      var2.distanceTo((Location)var1);
   }
}
