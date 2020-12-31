import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureStroke;
import android.graphics.Path;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bonds_cisdriver3__1355475792 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(GestureOverlayView.class);
      Gesture var2 = ((GestureOverlayView)var1).getGesture();
      ArrayList var3 = var2.getStrokes();
      Iterator var4 = var3.iterator();
      var1 = var4.next();
      GestureStroke var5 = (GestureStroke)var1;
      Path var6 = var5.getPath();
   }
}
