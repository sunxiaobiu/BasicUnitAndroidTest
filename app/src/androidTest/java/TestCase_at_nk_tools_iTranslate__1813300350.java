import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.DiffResult;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_nk_tools_iTranslate__1813300350 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Callback.class);
      DiffResult var1 = DiffUtil.calculateDiff((Callback)var0, false);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
