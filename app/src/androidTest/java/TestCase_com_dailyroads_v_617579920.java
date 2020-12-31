import android.content.ContentResolver;
import android.provider.MediaStore.Images.Thumbnails;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dailyroads_v_617579920 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      long var1 = 1L;
      Thumbnails.cancelThumbnailRequest((ContentResolver)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
