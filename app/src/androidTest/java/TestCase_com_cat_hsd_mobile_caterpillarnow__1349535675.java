import androidx.test.runner.AndroidJUnit4;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cat_hsd_mobile_caterpillarnow__1349535675 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Request.class);
      RetryPolicy var2 = ((Request)var1).getRetryPolicy();
      int var3 = var2.getCurrentRetryCount();
   }
}
