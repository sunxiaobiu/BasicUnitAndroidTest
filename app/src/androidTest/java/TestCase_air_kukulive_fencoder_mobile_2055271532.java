import android.media.AudioRecord;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_kukulive_fencoder_mobile_2055271532 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      int var1 = AudioRecord.getMinBufferSize(var0, 2, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
