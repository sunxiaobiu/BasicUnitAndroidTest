import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dja_onrecord_android_activities_1312841481 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Camera.class);
      Parameters var2 = ((Camera)var1).getParameters();
      List var3 = var2.getSupportedPreviewFrameRates();
   }
}
