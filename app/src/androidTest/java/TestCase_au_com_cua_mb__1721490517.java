import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__1721490517 {
   @Test
   public void testCase() throws Exception {
      MessageQueue var2 = null;
      var2 = Looper.myQueue();
      Object var1 = EasyMock.createMock(IdleHandler.class);
      var2.removeIdleHandler((IdleHandler)var1);
   }
}
