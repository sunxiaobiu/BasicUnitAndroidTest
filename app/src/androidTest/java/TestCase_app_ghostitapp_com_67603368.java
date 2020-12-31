import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_67603368 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaCodecInfo.class);
      CodecCapabilities var2 = ((MediaCodecInfo)var1).getCapabilitiesForType("video/avc");
   }
}
