import androidx.test.runner.AndroidJUnit4;
import androidx.work.WorkManager;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0E6D1C259C3167506DBEEB49B01BA56A0FBD4BE52AD730DA6304CE9E3607FA7D_1388122051 {
   @Test
   public void testCase() throws Exception {
      WorkManager var1 = WorkManager.getInstance();
      var1.cancelAllWork();
   }
}
