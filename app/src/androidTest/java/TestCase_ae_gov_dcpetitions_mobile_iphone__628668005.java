import android.content.Context;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__628668005 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent.class);
      String var2 = "android";
      var3.sendBroadcast((Intent)var1, var2);
   }
}
