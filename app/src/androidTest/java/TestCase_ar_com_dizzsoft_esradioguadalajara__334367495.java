import android.media.AudioTrack;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_dizzsoft_esradioguadalajara__334367495 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      int var1 = AudioTrack.getMinBufferSize(var0, 3, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
