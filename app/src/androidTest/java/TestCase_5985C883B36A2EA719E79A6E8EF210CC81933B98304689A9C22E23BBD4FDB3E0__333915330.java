import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__333915330 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Camera.class);
      Parameters var2 = ((Camera)var1).getParameters();
      var2.setMeteringAreas((List)null);
   }
}
