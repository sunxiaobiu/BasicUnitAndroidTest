import android.media.MediaCodec;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_archos_athome_center_1152795055 {
   @Test
   public void testCase() throws Exception {
      MediaCodec var1 = MediaCodec.createDecoderByType("video/avc");
      var1.flush();
   }
}
