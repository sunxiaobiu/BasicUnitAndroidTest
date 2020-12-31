import android.graphics.Bitmap;
import android.media.MediaMetadata.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bproduccioneswilvinsa_acandela__1189108942 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.putBitmap("android.media.metadata.ART", (Bitmap)var1);
   }
}
