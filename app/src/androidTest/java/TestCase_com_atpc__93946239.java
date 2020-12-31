import android.media.audiofx.AudioEffect;
import android.media.audiofx.AudioEffect.Descriptor;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_atpc__93946239 {
   public static void testCase() throws Exception {
      Descriptor[] var0 = AudioEffect.queryEffects();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
