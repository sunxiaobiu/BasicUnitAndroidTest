import androidx.core.util.Pools.SynchronizedPool;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801__1254167435 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SynchronizedPool.class);
      Object var1 = null;
      ((SynchronizedPool)var2).release(var1);
   }
}
