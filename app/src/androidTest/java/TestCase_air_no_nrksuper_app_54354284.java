import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app_54354284 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Resources var3 = var2.getResources();
      Object var1 = EasyMock.createMock(int.class);
      XmlResourceParser var4 = var3.getXml((int)var1);
      String var5 = var4.getText();
   }
}
