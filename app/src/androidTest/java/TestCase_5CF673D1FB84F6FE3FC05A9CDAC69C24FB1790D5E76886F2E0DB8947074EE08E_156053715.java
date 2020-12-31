import android.media.AudioFormat;
import android.media.AudioTrack.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CF673D1FB84F6FE3FC05A9CDAC69C24FB1790D5E76886F2E0DB8947074EE08E_156053715 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(AudioFormat.class);
      var2.setAudioFormat((AudioFormat)var1);
   }
}
