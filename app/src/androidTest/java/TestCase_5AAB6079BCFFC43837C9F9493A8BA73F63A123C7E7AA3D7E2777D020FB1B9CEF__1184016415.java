import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.core.content.res.ResourcesCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AAB6079BCFFC43837C9F9493A8BA73F63A123C7E7AA3D7E2777D020FB1B9CEF__1184016415 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Theme.class);
      ResourcesCompat.getColor((Resources)var0, var1, (Theme)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
