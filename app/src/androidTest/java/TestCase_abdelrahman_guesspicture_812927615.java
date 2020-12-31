import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_812927615 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(IBinder.class);
      Object var1 = null;
      ((IBinder)var2).linkToDeath((DeathRecipient)var1, 0);
   }
}
