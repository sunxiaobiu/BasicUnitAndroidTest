import androidx.test.runner.AndroidJUnit4;
import com.android.volley.Request;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_57682F837F1A05F94D38321FFD3E4AB40F6C41F64E2E3076362E66FF622BF77D__1127883502 {
   @Test
   public void testCase() throws Exception {
      PriorityBlockingQueue var1 = new PriorityBlockingQueue();
      Object var2 = EasyMock.createMock(BlockingQueue.class);
      var2 = ((BlockingQueue)var2).take();
      Request var3 = (Request)var2;
      boolean var4 = var3.hasHadResponseDelivered();
   }
}
