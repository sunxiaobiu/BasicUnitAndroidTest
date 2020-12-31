import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaControllerCompat.TransportControls;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_biblica_ebc__595872933 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      Context var4 = InstrumentationRegistry.getTargetContext();
      ComponentName var1 = new ComponentName(var4, BroadcastReceiver.class);
      MediaSessionCompat var2 = new MediaSessionCompat(var4, "example player session", var1, (PendingIntent)null);
      Token var6 = var2.getSessionToken();
      MediaControllerCompat var7 = new MediaControllerCompat(var4, var6);
      TransportControls var5 = var7.getTransportControls();
      var5.fastForward();
   }
}
