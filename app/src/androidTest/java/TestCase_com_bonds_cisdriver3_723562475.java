import android.gesture.GestureOverlayView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bonds_cisdriver3_723562475 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(GestureOverlayView.class);
      ((GestureOverlayView)var1).cancelClearAnimation();
   }
}
