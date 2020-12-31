import android.media.MediaPlayer;
import android.media.PlaybackParams;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ak_alizandro_smartaudiobookplayer_58274263 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var2 = new MediaPlayer();
      Object var1 = EasyMock.createMock(PlaybackParams.class);
      var2.setPlaybackParams((PlaybackParams)var1);
   }
}
