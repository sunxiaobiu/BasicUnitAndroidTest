import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ak_alizandro_smartaudiobookplayer__712293643 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var3 = new MediaPlayer();
      int var1 = var3.getAudioSessionId();
      Equalizer var4 = new Equalizer(0, var1);
      byte var5 = 1;
      byte var2 = 1;
      var4.setBandLevel(var5, var2);
   }
}
