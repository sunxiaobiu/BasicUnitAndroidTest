import android.graphics.Bitmap;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5D7B0166DA4EA227EDB542FC8E2B42661E28C9BED69BF64F4D52F6D1082DECC9__1993445245 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaMetadataCompat.class);
      MediaDescriptionCompat var2 = ((MediaMetadataCompat)var1).getDescription();
      Bitmap var3 = var2.getIconBitmap();
   }
}
