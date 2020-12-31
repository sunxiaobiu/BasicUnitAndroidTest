import android.os.HandlerThread;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__18168198 {
   @Test
   public void testCase() throws Exception {
      HandlerThread var1 = new HandlerThread("BeaconServiceThread", 10);
      var1.quitSafely();
   }
}
