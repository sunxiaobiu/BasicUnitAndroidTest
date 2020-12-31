import android.net.Uri;
import android.provider.MediaStore.Audio.Media;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager__247246405 {
   public static void testCase() throws Exception {
      Uri var0 = Media.getContentUri("external");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
