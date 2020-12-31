import androidx.test.runner.AndroidJUnit4;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59B76F961C678ED90E111FF383FCE11B5FBB677EEDC8E5754F41C1AFB95C8B66_1066086954 {
   @Test
   public void testCase() throws Exception {
      WorkManager var4 = WorkManager.getInstance();
      String var1 = "android";
      Object var2 = EasyMock.createMock(ExistingPeriodicWorkPolicy.class);
      Object var3 = EasyMock.createMock(PeriodicWorkRequest.class);
      var4.enqueueUniquePeriodicWork(var1, (ExistingPeriodicWorkPolicy)var2, (PeriodicWorkRequest)var3);
   }
}
