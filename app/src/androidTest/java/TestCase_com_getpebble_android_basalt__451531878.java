import android.media.MediaMetadata;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt__451531878 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaMetadata.class);
      long var1 = ((MediaMetadata)var3).getLong("android.media.metadata.DURATION");
   }
}
