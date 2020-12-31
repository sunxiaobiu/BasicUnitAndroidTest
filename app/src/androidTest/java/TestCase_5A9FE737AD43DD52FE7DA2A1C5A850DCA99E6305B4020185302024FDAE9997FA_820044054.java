import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A9FE737AD43DD52FE7DA2A1C5A850DCA99E6305B4020185302024FDAE9997FA_820044054 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parameters.class);
      String var1 = "android";
      ((Parameters)var2).setGpsProcessingMethod(var1);
   }
}
