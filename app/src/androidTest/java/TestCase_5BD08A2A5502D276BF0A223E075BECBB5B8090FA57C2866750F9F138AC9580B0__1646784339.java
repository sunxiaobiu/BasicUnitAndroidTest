import androidx.test.runner.AndroidJUnit4;
import androidx.work.WorkManager;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BD08A2A5502D276BF0A223E075BECBB5B8090FA57C2866750F9F138AC9580B0__1646784339 {
   @Test
   public void testCase() throws Exception {
      WorkManager var1 = WorkManager.getInstance();
      var1.cancelAllWorkByTag("BLOCK_UNLOCKED");
   }
}
