import androidx.test.runner.AndroidJUnit4;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C_1864271337 {
   @Test
   public void testCase() throws Exception {
      WorkManager var4 = WorkManager.getInstance();
      String var1 = "android";
      Object var2 = EasyMock.createMock(ExistingWorkPolicy.class);
      Object var3 = null;
      var4.beginUniqueWork(var1, (ExistingWorkPolicy)var2, (List)var3);
   }
}
