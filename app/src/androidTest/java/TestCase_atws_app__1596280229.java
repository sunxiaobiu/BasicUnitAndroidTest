import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__1596280229 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Uri.class);
      String var2 = ((Uri)var1).getUserInfo();
   }
}
