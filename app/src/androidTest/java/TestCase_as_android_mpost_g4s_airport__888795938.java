import android.content.Context;
import android.media.AudioManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_as_android_mpost_g4s_airport__888795938 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("audio");
      AudioManager var4 = (AudioManager)var3;
      boolean var1 = true;
      var4.setSpeakerphoneOn(var1);
   }
}
