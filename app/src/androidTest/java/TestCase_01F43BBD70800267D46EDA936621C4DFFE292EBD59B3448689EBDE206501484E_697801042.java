import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_697801042 {
   @Test
   public void testCase() throws Exception {
      MediaCodec var2 = MediaCodec.createEncoderByType("video/avc");
      Object var1 = EasyMock.createMock(BufferInfo.class);
      var2.dequeueOutputBuffer((BufferInfo)var1, 0L);
   }
}
