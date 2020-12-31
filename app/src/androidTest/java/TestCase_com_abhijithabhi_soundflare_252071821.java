import android.net.Uri;
import android.provider.MediaStore.Audio.Genres;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_abhijithabhi_soundflare_252071821 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Uri var1 = Genres.getContentUriForAudioId("external", var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
