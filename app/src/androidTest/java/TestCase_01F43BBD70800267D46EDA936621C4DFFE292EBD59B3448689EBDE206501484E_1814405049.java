import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_1814405049 {
   @Test
   public void testCase() throws Exception {
      MediaCodec var2 = MediaCodec.createEncoderByType("video/avc");
      Object var1 = EasyMock.createMock(MediaFormat.class);
      var2.configure((MediaFormat)var1, (Surface)null, (MediaCrypto)null, 1);
   }
}
