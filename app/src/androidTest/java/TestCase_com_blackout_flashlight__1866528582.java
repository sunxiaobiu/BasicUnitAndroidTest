import android.hardware.camera2.CameraManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blackout_flashlight__1866528582 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("camera");
      CameraManager var4 = (CameraManager)var3;
      String var1 = "android";
      var4.setTorchMode(var1, false);
   }
}
