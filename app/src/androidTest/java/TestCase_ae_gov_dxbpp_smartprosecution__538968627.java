import android.content.Context;
import android.renderscript.RenderScript;
import android.renderscript.RenderScript.RSMessageHandler;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution__538968627 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      RenderScript var3 = RenderScript.create(var2);
      Object var1 = EasyMock.createMock(RSMessageHandler.class);
      var3.setMessageHandler((RSMessageHandler)var1);
   }
}
