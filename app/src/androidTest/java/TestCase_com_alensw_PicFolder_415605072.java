import android.net.Uri;
import android.provider.MediaStore.Files;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alensw_PicFolder_415605072 {
   public static void testCase() throws Exception {
      long var1 = 1L;
      Uri var0 = Files.getContentUri("external", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
