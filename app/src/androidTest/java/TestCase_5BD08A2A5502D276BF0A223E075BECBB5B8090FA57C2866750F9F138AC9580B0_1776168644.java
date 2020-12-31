import androidx.test.runner.AndroidJUnit4;
import androidx.work.Worker;
import androidx.work.OneTimeWorkRequest.Builder;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BD08A2A5502D276BF0A223E075BECBB5B8090FA57C2866750F9F138AC9580B0_1776168644 {
   @Test
   public void testCase() throws Exception {
      Builder var1 = new Builder(Worker.class);
      androidx.work.WorkRequest.Builder var2 = var1.addTag("BLOCK_UNLOCKED");
   }
}
