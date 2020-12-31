import android.support.v4.util.Pools.Pool;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alphastudio_adrama_1117614175 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Pool.class);
      Object var1 = null;
      ((Pool)var2).release(var1);
   }
}
