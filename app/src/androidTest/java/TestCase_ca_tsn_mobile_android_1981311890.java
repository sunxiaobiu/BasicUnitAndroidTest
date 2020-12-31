import androidx.test.runner.AndroidJUnit4;
import com.android.volley.VolleyError;
import com.android.volley.Response.ErrorListener;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android_1981311890 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ErrorListener.class);
      Object var1 = EasyMock.createMock(VolleyError.class);
      ((ErrorListener)var2).onErrorResponse((VolleyError)var1);
   }
}
