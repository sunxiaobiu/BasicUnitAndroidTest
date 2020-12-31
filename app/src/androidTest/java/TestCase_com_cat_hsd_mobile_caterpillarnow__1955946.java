import androidx.test.runner.AndroidJUnit4;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cat_hsd_mobile_caterpillarnow__1955946 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Request.class);
      RetryPolicy var3 = ((Request)var2).getRetryPolicy();
      Object var1 = EasyMock.createMock(VolleyError.class);
      var3.retry((VolleyError)var1);
   }
}
