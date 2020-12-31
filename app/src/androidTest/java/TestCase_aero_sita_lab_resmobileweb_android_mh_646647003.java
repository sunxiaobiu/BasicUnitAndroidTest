import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh_646647003 {
   @Test
   public void testCase() throws Exception {
      Camera var1 = Camera.open();
      Parameters var2 = var1.getParameters();
      int var3 = var2.getPreviewFormat();
   }
}
