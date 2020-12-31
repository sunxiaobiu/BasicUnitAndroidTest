import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free_34084837 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      Object var4 = var3.getSystemService("camera");
      CameraManager var5 = (CameraManager)var4;
      Object var1 = EasyMock.createMock(AvailabilityCallback.class);
      Object var2 = EasyMock.createMock(Handler.class);
      var5.registerAvailabilityCallback((AvailabilityCallback)var1, (Handler)var2);
   }
}
