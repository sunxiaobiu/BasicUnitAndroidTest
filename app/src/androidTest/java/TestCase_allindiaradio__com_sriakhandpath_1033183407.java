import android.graphics.Bitmap;
import android.support.v4.media.MediaMetadataCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_allindiaradio__com_sriakhandpath_1033183407 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.putBitmap("android.media.metadata.DISPLAY_ICON", (Bitmap)var1);
   }
}
