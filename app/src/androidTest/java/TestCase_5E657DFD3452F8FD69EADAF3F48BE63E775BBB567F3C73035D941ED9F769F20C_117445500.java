import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C_117445500 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewGroup.class);
      Object var1 = null;
      ViewCompat.postOnAnimation((View)var0, (Runnable)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
