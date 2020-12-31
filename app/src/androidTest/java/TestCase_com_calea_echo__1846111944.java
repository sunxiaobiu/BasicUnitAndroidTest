import android.os.HandlerThread;
import androidx.test.runner.AndroidJUnit4;
import java.lang.Thread.State;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calea_echo__1846111944 {
   @Test
   public void testCase() throws Exception {
      HandlerThread var1 = new HandlerThread("smsHandlerThread", -1);
      State var2 = var1.getState();
   }
}
