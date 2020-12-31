import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_albr_gameday_1540046256 {
   @Test
   public void testCase() throws Exception {
      MyService var4 = new MyService();
      Object var1 = EasyMock.createMock(BroadcastReceiver.class);
      Object var2 = EasyMock.createMock(IntentFilter.class);
      Object var3 = null;
      var4.registerReceiver((BroadcastReceiver)var1, (IntentFilter)var2, (String)null, (Handler)var3);
   }
}
