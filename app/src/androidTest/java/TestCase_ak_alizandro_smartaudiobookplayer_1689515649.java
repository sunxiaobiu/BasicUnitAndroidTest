import android.media.MediaPlayer;
import android.media.audiofx.LoudnessEnhancer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ak_alizandro_smartaudiobookplayer_1689515649 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var2 = new MediaPlayer();
      int var3 = var2.getAudioSessionId();
      LoudnessEnhancer var1 = new LoudnessEnhancer(var3);
      var1.setEnabled(true);
   }
}
