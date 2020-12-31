import android.media.MediaPlayer;
import android.media.MediaPlayer.TrackInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8_63433801 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaPlayer.class);
      MediaPlayer var2 = new MediaPlayer();
      TrackInfo[] var3 = var2.getTrackInfo();
   }
}
