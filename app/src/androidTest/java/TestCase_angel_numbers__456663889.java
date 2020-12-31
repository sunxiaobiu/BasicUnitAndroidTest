import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers__456663889 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Camera.class);
      Parameters var2 = ((Camera)var1).getParameters();
      var2.set("jpeg-quality", 100);
   }
}
