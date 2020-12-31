import androidx.test.runner.AndroidJUnit4;
import androidx.work.WorkManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A7DC645A5AF1BFBB6189D9580EF563646BEA2A4C796F4F9A5AD104AF6E61025_361389950 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WorkManager.class);
      WorkManagerImpl var2 = (WorkManagerImpl)var1;
      WorkDatabase var3 = var2.getWorkDatabase();
      WorkSpecDao var4 = var3.workSpecDao();
   }
}
