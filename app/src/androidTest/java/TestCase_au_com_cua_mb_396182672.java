import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_396182672 {
   @Test
   public void testCase() throws Exception {
      MediaRecorder var2 = new MediaRecorder();
      Object var1 = null;
      var2.setOnErrorListener((OnErrorListener)var1);
   }
}
