import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_1845500447 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(HurlStack.class);
      Volley.newRequestQueue((Context)var0, (HttpStack)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
