import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.provider.MediaStore.Images.Media;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_nsw_service__732889700 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      Media.insertImage((ContentResolver)var0, (Bitmap)var1, "", "");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
