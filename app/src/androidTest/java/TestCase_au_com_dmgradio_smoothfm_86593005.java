import android.content.Context;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Token;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dmgradio_smoothfm_86593005 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      MediaSession var1 = new MediaSession(var2, "simple player session");
      Token var3 = var1.getSessionToken();
   }
}
