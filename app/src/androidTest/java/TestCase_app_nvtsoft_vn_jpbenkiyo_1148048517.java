import android.media.AudioTrack;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_nvtsoft_vn_jpbenkiyo_1148048517 {
   @Test
   public void testCase() throws Exception {
      byte var3 = 2;
      short var1 = 11025;
      AudioTrack var2 = new AudioTrack(3, var1, 4, var3, 4096, 1);
      int var4 = var2.getPlayState();
   }
}
