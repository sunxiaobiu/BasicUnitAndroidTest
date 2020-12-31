import android.app.Application;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_00F7DA3B1CCB438A32B1B9DB1CFCF12830ADF9BECCEEB8E2932FE0E7AA2E98FC_515162256 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Application.class);
      var1 = ((Application)var1).getSystemService("connectivity");
   }
}
