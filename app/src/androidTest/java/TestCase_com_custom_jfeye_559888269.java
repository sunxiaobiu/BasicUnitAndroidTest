import android.media.AudioRecord;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_custom_jfeye_559888269 {
   @Test
   public void testCase() throws Exception {
      int var2 = AudioRecord.getMinBufferSize(8000, 2, 2);
      AudioRecord var1 = new AudioRecord(1, 8000, 2, 2, var2);
      AudioRecord var3 = var1;
      byte[] var4 = new byte[1];
      var3.read(var4, 0, 640);
   }
}
