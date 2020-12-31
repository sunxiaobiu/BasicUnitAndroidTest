import android.util.Xml;
import android.util.Xml.Encoding;
import androidx.test.runner.AndroidJUnit4;
import java.io.InputStream;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers__1744596936 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Encoding.class);
      Object var2 = null;
      Xml.parse((InputStream)var0, (Encoding)var1, (ContentHandler)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
