import androidx.test.runner.AndroidJUnit4;
import com.android.volley.Request;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_vic_ptv__662930465 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Request.class);
      ((Request)var1).addMarker("PTV");
   }
}
