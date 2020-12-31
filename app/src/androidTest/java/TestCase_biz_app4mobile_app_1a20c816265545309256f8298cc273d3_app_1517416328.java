import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biz_app4mobile_app_1a20c816265545309256f8298cc273d3_app_1517416328 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Camera.class);
      Parameters var2 = ((Camera)var1).getParameters();
      List var3 = var2.getSupportedColorEffects();
   }
}
