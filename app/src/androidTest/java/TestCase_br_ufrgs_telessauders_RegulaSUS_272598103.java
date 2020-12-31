import android.support.v4.widget.ViewDragHelper;
import android.support.v4.widget.ViewDragHelper.Callback;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_ufrgs_telessauders_RegulaSUS_272598103 {
   public static void testCase() throws Exception {
      Object var0 = null;
      float var1 = 1.0F;
      Object var2 = EasyMock.createMock(Callback.class);
      ViewDragHelper.create((ViewGroup)var0, var1, (Callback)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
