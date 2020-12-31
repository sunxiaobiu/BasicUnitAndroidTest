import android.media.AudioTrack;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alokm_soundgenerator_1078891259 {
   @Test
   public void testCase() throws Exception {
      byte[] var2 = new byte[176400];
      int var3 = var2.length;
      AudioTrack var1 = new AudioTrack(3, 44100, 4, 2, var3, 0);
      AudioTrack var4 = var1;
      byte var5 = 1;
      var4.setLoopPoints(0, var5, -1);
   }
}
