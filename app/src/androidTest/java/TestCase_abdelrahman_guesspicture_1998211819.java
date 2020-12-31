import android.app.PendingIntent;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_1998211819 {
   @Test
   public void testCase() throws Exception {
      Handler var4 = new Handler();
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var4.obtainMessage(3, var1, var2, var3);
   }
}
