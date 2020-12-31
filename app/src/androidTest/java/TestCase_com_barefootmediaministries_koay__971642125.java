import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_barefootmediaministries_koay__971642125 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(OnBufferingUpdateListener.class);
      Object var1 = EasyMock.createMock(MediaPlayer.class);
      byte var2 = 1;
      ((OnBufferingUpdateListener)var3).onBufferingUpdate((MediaPlayer)var1, var2);
   }
}
