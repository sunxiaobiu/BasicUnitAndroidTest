import android.media.MediaPlayer;
import android.media.audiofx.LoudnessEnhancer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ak_alizandro_smartaudiobookplayer__801871766 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var2 = new MediaPlayer();
      int var1 = var2.getAudioSessionId();
      LoudnessEnhancer var3 = new LoudnessEnhancer(var1);
      byte var4 = 1;
      var3.setTargetGain(var4);
   }
}
