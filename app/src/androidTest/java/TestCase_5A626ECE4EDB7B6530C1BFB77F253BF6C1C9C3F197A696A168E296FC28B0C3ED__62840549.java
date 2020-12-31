import androidx.test.runner.AndroidJUnit4;
import androidx.work.Worker;
import androidx.work.OneTimeWorkRequest.Builder;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED__62840549 {
   @Test
   public void testCase() throws Exception {
      Builder var4 = new Builder(Worker.class);
      long var1 = 1L;
      Object var3 = null;
      var4.setInitialDelay(var1, (TimeUnit)var3);
   }
}
