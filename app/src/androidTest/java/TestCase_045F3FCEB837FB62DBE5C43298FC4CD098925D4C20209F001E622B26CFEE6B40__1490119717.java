import androidx.test.runner.AndroidJUnit4;
import androidx.work.Worker;
import androidx.work.PeriodicWorkRequest.Builder;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_045F3FCEB837FB62DBE5C43298FC4CD098925D4C20209F001E622B26CFEE6B40__1490119717 {
   @Test
   public void testCase() throws Exception {
      TimeUnit var3 = TimeUnit.MINUTES;
      TimeUnit var1 = TimeUnit.HOURS;
      Builder var2 = new Builder(Worker.class, 12L, var1, 30L, var3);
      var2.setInitialDelay(15L, var1);
   }
}
