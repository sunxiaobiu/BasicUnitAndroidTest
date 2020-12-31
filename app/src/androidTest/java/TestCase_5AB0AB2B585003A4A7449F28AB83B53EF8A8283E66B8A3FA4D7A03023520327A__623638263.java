import android.support.v4.util.Pools.SynchronizedPool;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AB0AB2B585003A4A7449F28AB83B53EF8A8283E66B8A3FA4D7A03023520327A__623638263 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SynchronizedPool.class);
      Object var1 = null;
      ((SynchronizedPool)var2).release(var1);
   }
}
