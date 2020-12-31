import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biz_app4mobile_app_1a20c816265545309256f8298cc273d3_app_1492866759 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Resources var3 = var1.getResources();
      String var5 = var1.getPackageName();
      Object var2 = EasyMock.createMock(String.class);
      int var6 = var3.getIdentifier((String)var2, "xml", var5);
      XmlResourceParser var4 = var3.getXml(var6);
      var6 = var4.getAttributeIntValue((String)null, "orientation-handset", 0);
   }
}
