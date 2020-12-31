import android.media.MediaRecorder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_674053394 {
   @Test
   public void testCase() throws Exception {
      MediaRecorder var2 = new MediaRecorder();
      byte var1 = 1;
      var2.setMaxDuration(var1);
   }
}
