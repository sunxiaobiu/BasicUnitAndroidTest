import androidx.test.runner.AndroidJUnit4;
import com.android.volley.VolleyError;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_indeed_androidemployers_1287564852 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(VolleyError.class);
      long var1 = ((VolleyError)var3).getNetworkTimeMs();
   }
}
