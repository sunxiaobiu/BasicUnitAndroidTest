import androidx.test.runner.AndroidJUnit4;
import androidx.work.WorkManager;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED_960895837 {
   @Test
   public void testCase() throws Exception {
      WorkManager var2 = WorkManager.getInstance();
      var2 = null;
      WorkManager var1 = WorkManager.getInstance();
      String var3 = "android";
      var2.cancelAllWorkByTag(var3);
   }
}