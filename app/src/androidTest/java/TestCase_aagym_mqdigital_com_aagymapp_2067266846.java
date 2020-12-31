import android.media.AudioTrack;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp_2067266846 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AudioTrack.class);
      int var2 = ((AudioTrack)var1).getAudioSessionId();
   }
}
