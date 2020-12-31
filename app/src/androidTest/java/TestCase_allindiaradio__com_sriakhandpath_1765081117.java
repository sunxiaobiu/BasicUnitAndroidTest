import android.media.AudioManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_allindiaradio__com_sriakhandpath_1765081117 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AudioManager.class);
      ((AudioManager)var1).adjustVolume(-1, 4);
   }
}
