import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F11FDEFF567AF8E29BB8C01674605340284B0198D3B0F7E0AE7B13202477E64_960893308 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Callback.class);
      Object var1 = EasyMock.createMock(MediaMetadataCompat.class);
      ((Callback)var2).onMetadataChanged((MediaMetadataCompat)var1);
   }
}
