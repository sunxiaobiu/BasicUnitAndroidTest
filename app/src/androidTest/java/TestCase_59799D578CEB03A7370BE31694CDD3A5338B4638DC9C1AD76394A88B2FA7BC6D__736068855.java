import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import java.util.Set;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D__736068855 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Uri var2 = ((Intent)var1).getData();
      Set var3 = var2.getQueryParameterNames();
   }
}
