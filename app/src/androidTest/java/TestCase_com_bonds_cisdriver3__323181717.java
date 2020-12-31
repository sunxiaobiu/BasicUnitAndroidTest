import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bonds_cisdriver3__323181717 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(GestureOverlayView.class);
      Gesture var2 = ((GestureOverlayView)var1).getGesture();
      ArrayList var3 = var2.getStrokes();
   }
}
