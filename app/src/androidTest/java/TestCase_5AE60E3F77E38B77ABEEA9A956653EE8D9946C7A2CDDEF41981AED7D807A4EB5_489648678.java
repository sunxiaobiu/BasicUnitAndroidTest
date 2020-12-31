import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AE60E3F77E38B77ABEEA9A956653EE8D9946C7A2CDDEF41981AED7D807A4EB5_489648678 {
   @Test
   public void testCase() throws Exception {
      Camera var1 = Camera.open();
      Parameters var2 = var1.getParameters();
      int var3 = var2.getInt("zoom");
   }
}
