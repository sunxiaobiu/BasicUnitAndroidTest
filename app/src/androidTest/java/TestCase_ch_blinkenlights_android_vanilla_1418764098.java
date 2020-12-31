import android.provider.MediaStore.Audio;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_blinkenlights_android_vanilla_1418764098 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = Audio.keyFor(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
