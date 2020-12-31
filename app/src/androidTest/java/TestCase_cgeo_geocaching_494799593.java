import android.sax.RootElement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching_494799593 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(String.class);
      RootElement var1 = new RootElement((String)var2, "gpx");
      ContentHandler var3 = var1.getContentHandler();
   }
}
