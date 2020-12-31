import androidx.test.runner.AndroidJUnit4;
import androidx.work.Operation;
import androidx.work.WorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_08C7128379FFE7EBFDF0832254E676EEB2F0E19B5063D130A94D3857F0FC23B0_1693668753 {
   @Test
   public void testCase() throws Exception {
      WorkManager var1 = WorkManager.getInstance();
      Operation var2 = var1.cancelAllWorkByTag("cache-updater");
      ListenableFuture var3 = var2.getResult();
   }
}
