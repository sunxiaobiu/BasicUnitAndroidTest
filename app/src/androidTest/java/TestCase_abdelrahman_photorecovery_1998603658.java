import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1998603658 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Handler.class);
      Handler var1 = new Handler();
      var1 = null;
      ((Handler)var2).obtainMessage(1, var1);
   }
}
