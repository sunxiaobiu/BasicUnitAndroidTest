import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_angryrobot_wikicamps__776078830 {
   @Test
   public void testCase() throws Exception {
      UrlQuerySanitizer var2 = new UrlQuerySanitizer();
      Object var1 = EasyMock.createMock(ValueSanitizer.class);
      var2.setUnregisteredParameterValueSanitizer((ValueSanitizer)var1);
   }
}
