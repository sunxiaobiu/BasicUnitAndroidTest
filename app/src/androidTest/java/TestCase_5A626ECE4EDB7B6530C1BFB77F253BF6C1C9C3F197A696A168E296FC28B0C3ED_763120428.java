import androidx.test.runner.AndroidJUnit4;
import androidx.work.Constraints;
import androidx.work.Worker;
import androidx.work.OneTimeWorkRequest.Builder;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED_763120428 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder(Worker.class);
      Object var1 = EasyMock.createMock(Constraints.class);
      var2.setConstraints((Constraints)var1);
   }
}
