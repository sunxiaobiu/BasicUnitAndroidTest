import android.content.Context;
import android.media.AudioManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_ncr_selfserv__1179393657 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("audio");
      AudioManager var3 = (AudioManager)var2;
      boolean var4 = var3.isMicrophoneMute();
   }
}
