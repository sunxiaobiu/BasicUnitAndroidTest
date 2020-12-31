import android.media.MediaCodec;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector__113450006 {
   @Test
   public void testCase() throws Exception {
      MediaCodec var1 = MediaCodec.createEncoderByType("video/avc");
      String var2 = var1.getName();
   }
}
