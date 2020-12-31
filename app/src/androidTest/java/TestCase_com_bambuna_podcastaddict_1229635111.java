import android.media.MediaPlayer;
import android.media.PlaybackParams;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bambuna_podcastaddict_1229635111 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var1 = new MediaPlayer();
      PlaybackParams var2 = var1.getPlaybackParams();
      var1 = null;
      var2 = new PlaybackParams();
      var2.setPitch(1.0F);
   }
}
