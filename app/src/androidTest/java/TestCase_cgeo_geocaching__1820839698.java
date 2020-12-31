import android.sax.Element;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching__1820839698 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Element.class);
      String var1 = "android";
      ((Element)var2).getChild(var1, "visited");
   }
}
