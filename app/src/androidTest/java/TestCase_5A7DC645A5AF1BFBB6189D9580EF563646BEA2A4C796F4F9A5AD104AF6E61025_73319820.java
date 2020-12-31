import androidx.test.runner.AndroidJUnit4;
import androidx.work.Constraints;
import androidx.work.Worker;
import androidx.work.OneTimeWorkRequest.Builder;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A7DC645A5AF1BFBB6189D9580EF563646BEA2A4C796F4F9A5AD104AF6E61025_73319820 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder(Worker.class);
      Object var1 = EasyMock.createMock(Constraints.class);
      var2.setConstraints((Constraints)var1);
   }
}
