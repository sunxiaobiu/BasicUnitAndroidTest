import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession.Token;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dmgradio_smoothfm__1655715126 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      MediaSession var1 = new MediaSession(var3, "simple player session");
      Token var5 = var1.getSessionToken();
      MediaController var2 = new MediaController(var3, var5);
      TransportControls var4 = var2.getTransportControls();
      var4.skipToNext();
   }
}
