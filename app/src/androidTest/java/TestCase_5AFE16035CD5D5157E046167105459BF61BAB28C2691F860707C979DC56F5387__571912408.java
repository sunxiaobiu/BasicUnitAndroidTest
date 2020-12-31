import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AFE16035CD5D5157E046167105459BF61BAB28C2691F860707C979DC56F5387__571912408 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Resources var3 = var2.getResources();
      Configuration var4 = var3.getConfiguration();
      Object var1 = EasyMock.createMock(Configuration.class);
      var4.updateFrom((Configuration)var1);
   }
}
