import android.content.res.XmlResourceParser;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_durantik_durantemoji__516048873 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(XmlResourceParser.class);
      ((XmlResourceParser)var1).setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
   }
}
