import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_04B9849269DC3B9AE5DF9A2062BAD2B9EBE5E8795CE846E5D14E155FEF11DC92__644367038 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      WorkManager var3 = WorkManager.getInstance(var2);
      Object var1 = EasyMock.createMock(WorkRequest.class);
      var3.enqueue((WorkRequest)var1);
   }
}
