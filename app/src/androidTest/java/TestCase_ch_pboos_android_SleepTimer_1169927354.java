import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_pboos_android_SleepTimer_1169927354 {
   @Test
   public void testCase() throws Exception {
      Builder var3 = new Builder(1);
      Object var1 = null;
      Object var2 = EasyMock.createMock(Handler.class);
      var3.setOnAudioFocusChangeListener((OnAudioFocusChangeListener)var1, (Handler)var2);
   }
}
