import android.location.Address;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_webjet__1799053108 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Address.class);
      String var2 = ((Address)var1).getSubLocality();
   }
}
