import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_lrmobile_2054708830 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(String.class);
      Location var1 = new Location((String)var2);
      Location var3 = var1;
      Object var4 = EasyMock.createMock(Location.class);
      var3.set((Location)var4);
   }
}
