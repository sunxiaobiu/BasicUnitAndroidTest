import android.content.ContentResolver;
import android.graphics.BitmapFactory.Options;
import android.provider.MediaStore.Images.Thumbnails;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_almalence_hdr_862995215 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      long var1 = 1L;
      Thumbnails.getThumbnail((ContentResolver)var0, var1, 1, (Options)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
