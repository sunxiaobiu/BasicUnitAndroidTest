import android.location.Address;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching__1768490953 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Address.class);
      String var1 = "android";
      ((Address)var2).setLocality(var1);
   }
}
