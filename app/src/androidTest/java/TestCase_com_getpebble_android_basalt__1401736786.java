import android.media.MediaMetadata;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt__1401736786 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaMetadata.class);
      String var2 = ((MediaMetadata)var1).getString("android.media.metadata.ARTIST");
   }
}
