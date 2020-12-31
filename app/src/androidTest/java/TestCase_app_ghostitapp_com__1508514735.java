import android.media.MediaCodec;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com__1508514735 {
   @Test
   public void testCase() throws Exception {
      MediaCodec var2 = MediaCodec.createEncoderByType("video/avc");
      byte var1 = 1;
      var2.getOutputBuffer(var1);
   }
}
