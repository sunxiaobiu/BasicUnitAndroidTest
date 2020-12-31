import android.net.Uri;
import android.provider.MediaStore.Audio.Genres.Members;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_studio_mp3player__929889314 {
   public static void testCase() throws Exception {
      long var1 = 1L;
      Uri var0 = Members.getContentUri("external", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
