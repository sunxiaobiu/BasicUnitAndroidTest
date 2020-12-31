import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote_412207026 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(GestureOverlayView.class);
      Object var1 = EasyMock.createMock(Gesture.class);
      ((GestureOverlayView)var2).setGesture((Gesture)var1);
   }
}
