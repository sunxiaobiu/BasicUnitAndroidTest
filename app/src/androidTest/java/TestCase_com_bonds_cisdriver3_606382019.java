import android.gesture.GestureOverlayView;
import android.graphics.Path;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bonds_cisdriver3_606382019 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(GestureOverlayView.class);
      Path var2 = ((GestureOverlayView)var1).getGesturePath();
   }
}
