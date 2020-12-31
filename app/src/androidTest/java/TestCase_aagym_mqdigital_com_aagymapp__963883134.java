import android.net.Uri;
import android.support.v4.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp__963883134 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Builder.class);
      Object var1 = EasyMock.createMock(Uri.class);
      ((Builder)var2).setSound((Uri)var1);
   }
}
