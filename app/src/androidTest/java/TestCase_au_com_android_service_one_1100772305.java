import androidx.test.runner.AndroidJUnit4;
import com.android.volley.VolleyError;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_android_service_one_1100772305 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(VolleyError.class);
      Throwable var2 = ((VolleyError)var1).getCause();
   }
}
