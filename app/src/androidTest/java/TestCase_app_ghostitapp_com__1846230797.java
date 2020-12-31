import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com__1846230797 {
   @Test
   public void testCase() throws Exception {
      MediaExtractor var2 = new MediaExtractor();
      byte var1 = 0;
      int var5 = var1 + 1;
      MediaFormat var3 = var2.getTrackFormat(var5);
      String var4 = var3.getString("mime");
      MediaCodec var6 = MediaCodec.createDecoderByType(var4);
      var1 = 1;
      var6.getInputBuffer(var1);
   }
}
