import android.content.res.Configuration;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A426B6E4A1DFA30D693F480193F158DF448A2B7DA487ECA255094A2A681F481__1156742171 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Configuration.class);
      LocaleListCompat var1 = ConfigurationCompat.getLocales((Configuration)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
