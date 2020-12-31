import android.hardware.Camera;
import android.hardware.Camera.FaceDetectionListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0A966961CBA41BE004B028F1D18295810C8D123EFA8F46B3FBA64F694870A5C3__2084542766 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(int.class);
      Camera var3 = Camera.open((int)var2);
      Object var1 = null;
      var3.setFaceDetectionListener((FaceDetectionListener)var1);
   }
}
