import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ak_alizandro_smartaudiobookplayer_2030242648 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var2 = new MediaPlayer();
      int var3 = var2.getAudioSessionId();
      Equalizer var1 = new Equalizer(0, var3);
      short[] var4 = var1.getBandLevelRange();
   }
}
