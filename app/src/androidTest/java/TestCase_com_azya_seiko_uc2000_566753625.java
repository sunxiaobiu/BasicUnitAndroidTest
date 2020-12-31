import android.media.AudioTrack;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_azya_seiko_uc2000_566753625 {
   public static void testCase() throws Exception {
      int var0 = AudioTrack.getNativeOutputSampleRate(3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
