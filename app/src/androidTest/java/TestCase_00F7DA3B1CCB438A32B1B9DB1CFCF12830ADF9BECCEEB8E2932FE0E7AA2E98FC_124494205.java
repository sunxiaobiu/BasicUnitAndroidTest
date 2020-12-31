import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_00F7DA3B1CCB438A32B1B9DB1CFCF12830ADF9BECCEEB8E2932FE0E7AA2E98FC_124494205 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Application.class);
      Object var1 = EasyMock.createMock(BroadcastReceiver.class);
      Object var2 = EasyMock.createMock(IntentFilter.class);
      ((Application)var3).registerReceiver((BroadcastReceiver)var1, (IntentFilter)var2);
   }
}
