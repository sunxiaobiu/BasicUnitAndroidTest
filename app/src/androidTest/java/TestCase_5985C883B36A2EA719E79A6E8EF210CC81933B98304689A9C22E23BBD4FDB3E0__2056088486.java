import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.os.Handler;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__2056088486 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("camera");
      CameraManager var6 = (CameraManager)var5;
      String var1 = "android";
      Object var2 = EasyMock.createMock(StateCallback.class);
      Object var3 = EasyMock.createMock(Handler.class);
      var6.openCamera(var1, (StateCallback)var2, (Handler)var3);
   }
}
