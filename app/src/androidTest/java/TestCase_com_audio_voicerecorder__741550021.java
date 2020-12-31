import android.net.Uri;
import android.provider.MediaStore.Audio.Playlists;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_audio_voicerecorder__741550021 {
   public static void testCase() throws Exception {
      Uri var0 = Playlists.getContentUri("external");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
