import androidx.test.runner.AndroidJUnit4;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.OneTimeWorkRequest.Builder;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A7DC645A5AF1BFBB6189D9580EF563646BEA2A4C796F4F9A5AD104AF6E61025__6753106 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder(Worker.class);
      androidx.work.Constraints.Builder var1 = new androidx.work.Constraints.Builder();
      var1 = var1.setRequiresBatteryNotLow(true);
      Constraints var4 = var1.build();
      androidx.work.WorkRequest.Builder var3 = var2.setConstraints(var4);
      var2 = (Builder)var3;
      Object var5 = EasyMock.createMock(Data.class);
      var2.setInputData((Data)var5);
   }
}
