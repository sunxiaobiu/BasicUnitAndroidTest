import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AAB6079BCFFC43837C9F9493A8BA73F63A123C7E7AA3D7E2777D020FB1B9CEF__904106221 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      boolean var1 = ContextCompat.isDeviceProtectedStorage((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
