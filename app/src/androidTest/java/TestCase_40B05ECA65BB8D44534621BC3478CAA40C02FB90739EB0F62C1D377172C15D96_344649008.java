import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_40B05ECA65BB8D44534621BC3478CAA40C02FB90739EB0F62C1D377172C15D96_344649008 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(AudioPlaybackCaptureConfiguration.class);
      var2.setAudioPlaybackCaptureConfig((AudioPlaybackCaptureConfiguration)var1);
   }
}
