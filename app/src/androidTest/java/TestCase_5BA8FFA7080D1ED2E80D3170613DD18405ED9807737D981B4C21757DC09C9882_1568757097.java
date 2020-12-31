import android.app.PendingIntent;
import android.content.Intent;
import android.media.RemoteControlClient;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BA8FFA7080D1ED2E80D3170613DD18405ED9807737D981B4C21757DC09C9882_1568757097 {
   @Test
   public void testCase() throws Exception {
      Intent var5 = new Intent();
      MyService var1 = new MyService();
      PendingIntent var6 = PendingIntent.getBroadcast(var1, 0, var5, 0);
      RemoteControlClient var8 = new RemoteControlClient(var6);
      RemoteControlClient var7 = var8;
      byte var9 = 1;
      long var2 = 1L;
      float var4 = 1.0F;
      var7.setPlaybackState(var9, var2, var4);
   }
}
