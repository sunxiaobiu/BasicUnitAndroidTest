import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5981C0AFAA88BBBAC4D5C577A4C59D147145269B3562BAC05C4A5960BF8173C2__545218171 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Camera.class);
      Parameters var2 = ((Camera)var1).getParameters();
      String var3 = var2.getFlashMode();
   }
}
