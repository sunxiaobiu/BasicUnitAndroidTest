import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.DiffResult;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_iknowthepilot__1689682058 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Callback.class);
      DiffResult var1 = DiffUtil.calculateDiff((Callback)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
