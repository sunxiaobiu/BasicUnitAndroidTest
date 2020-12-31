import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AAB6079BCFFC43837C9F9493A8BA73F63A123C7E7AA3D7E2777D020FB1B9CEF_1650417486 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(HurlStack.class);
      Volley.newRequestQueue((Context)var0, (BaseHttpStack)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
