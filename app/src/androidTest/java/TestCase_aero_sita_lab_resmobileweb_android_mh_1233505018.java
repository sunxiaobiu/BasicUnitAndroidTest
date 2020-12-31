import android.hardware.Camera;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh_1233505018 {
   @Test
   public void testCase() throws Exception {
      Camera var2 = Camera.open();
      byte[] var1 = new byte[1];
      var2.addCallbackBuffer(var1);
   }
}
