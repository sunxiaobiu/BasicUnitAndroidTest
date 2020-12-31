import androidx.test.runner.AndroidJUnit4;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_golmobile_placaruol_794342478 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ImageListener.class);
      ((ImageListener)var1).onErrorResponse((VolleyError)null);
   }
}
