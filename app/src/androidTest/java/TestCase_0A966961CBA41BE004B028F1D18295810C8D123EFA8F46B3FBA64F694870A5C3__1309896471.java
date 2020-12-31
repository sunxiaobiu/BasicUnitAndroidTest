import android.hardware.Camera;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0A966961CBA41BE004B028F1D18295810C8D123EFA8F46B3FBA64F694870A5C3__1309896471 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(int.class);
      Camera var2 = Camera.open((int)var1);
      var2.startFaceDetection();
   }
}
