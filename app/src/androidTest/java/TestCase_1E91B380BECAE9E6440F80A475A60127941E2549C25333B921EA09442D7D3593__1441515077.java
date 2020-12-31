import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E91B380BECAE9E6440F80A475A60127941E2549C25333B921EA09442D7D3593__1441515077 {
   @Test
   public void testCase() throws Exception {
      DeviceAdminReceiver var2 = new DeviceAdminReceiver();
      Object var1 = EasyMock.createMock(Context.class);
      var2.getManager((Context)var1);
   }
}
