import android.media.MediaPlayer;
import android.media.audiofx.Virtualizer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_android_DroidLiveLite__117469403 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var2 = new MediaPlayer();
      int var3 = var2.getAudioSessionId();
      Object var4 = EasyMock.createMock(int.class);
      Virtualizer var1 = new Virtualizer(0, (int)var4);
      Virtualizer var5 = var1;
      byte var6 = 1;
      var5.setStrength(var6);
   }
}
