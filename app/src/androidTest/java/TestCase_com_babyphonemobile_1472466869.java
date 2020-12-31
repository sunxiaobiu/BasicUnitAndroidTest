import android.media.AudioTrack;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_babyphonemobile_1472466869 {
   @Test
   public void testCase() throws Exception {
      int var3 = AudioTrack.getMinBufferSize(8000, 4, 2);
      AudioTrack var1 = new AudioTrack(3, 8000, 4, 2, var3, 1);
      AudioTrack var4 = var1;
      byte var5 = 1;
      short[] var2 = new short[1];
      var4.write(var2, 0, var5);
   }
}
