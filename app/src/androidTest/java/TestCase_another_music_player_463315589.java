import android.media.audiofx.Equalizer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player_463315589 {
   @Test
   public void testCase() throws Exception {
      Equalizer var1 = new Equalizer(1, 0);
      short var2 = var1.getNumberOfPresets();
   }
}
