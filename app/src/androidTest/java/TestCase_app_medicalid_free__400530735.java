import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free__400530735 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("camera");
      CameraManager var4 = (CameraManager)var3;
      Object var1 = EasyMock.createMock(AvailabilityCallback.class);
      var4.unregisterAvailabilityCallback((AvailabilityCallback)var1);
   }
}
