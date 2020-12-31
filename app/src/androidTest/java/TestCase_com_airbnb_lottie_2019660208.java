import android.support.v4.widget.ViewDragHelper;
import android.support.v4.widget.ViewDragHelper.Callback;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airbnb_lottie_2019660208 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Callback.class);
      ViewDragHelper.create((ViewGroup)var0, (Callback)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
