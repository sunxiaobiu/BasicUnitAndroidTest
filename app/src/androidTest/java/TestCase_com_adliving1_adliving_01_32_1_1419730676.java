import androidx.test.runner.AndroidJUnit4;
import com.android.volley.Request;
import com.android.volley.toolbox.RequestFuture;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adliving1_adliving_01_32_1_1419730676 {
   @Test
   public void testCase() throws Exception {
      RequestFuture var2 = RequestFuture.newFuture();
      Object var1 = EasyMock.createMock(Request.class);
      var2.setRequest((Request)var1);
   }
}
