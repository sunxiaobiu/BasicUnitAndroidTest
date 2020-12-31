import android.media.AudioManager;
import android.media.RemoteControlClient;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ait_podka_1231136307 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("audio");
      AudioManager var4 = (AudioManager)var3;
      Object var1 = EasyMock.createMock(RemoteControlClient.class);
      var4.unregisterRemoteControlClient((RemoteControlClient)var1);
   }
}
