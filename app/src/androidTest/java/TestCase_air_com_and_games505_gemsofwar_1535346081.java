import android.content.res.XmlResourceParser;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_and_games505_gemsofwar_1535346081 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(XmlResourceParser.class);
      boolean var2 = ((XmlResourceParser)var1).getAttributeBooleanValue((String)"android", "foreground", true);
   }
}
