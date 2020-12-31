import android.content.res.XmlResourceParser;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_shebah_driver_1637912765 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(XmlResourceParser.class);
      byte var1 = 1;
      ((XmlResourceParser)var2).getIdAttributeResourceValue(var1);
   }
}
