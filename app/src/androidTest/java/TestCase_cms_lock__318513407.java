import android.content.Context;
import android.media.AudioManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cms_lock__318513407 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("audio");
      AudioManager var3 = (AudioManager)var2;
      int var4 = var3.getVibrateSetting(0);
   }
}
