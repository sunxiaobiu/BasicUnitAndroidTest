import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_748295052 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ServiceConnection.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(IBinder.class);
      ((ServiceConnection)var3).onServiceConnected((ComponentName)var1, (IBinder)var2);
   }
}
