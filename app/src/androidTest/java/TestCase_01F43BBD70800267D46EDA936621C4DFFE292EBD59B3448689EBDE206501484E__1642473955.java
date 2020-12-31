import android.media.MediaCodec;
import android.view.Surface;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E__1642473955 {
   @Test
   public void testCase() throws Exception {
      MediaCodec var1 = MediaCodec.createEncoderByType("video/avc");
      Surface var2 = var1.createInputSurface();
   }
}
