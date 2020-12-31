import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_underside_ipw_1919926664 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Canvas.class);
      Rect var2 = ((Canvas)var1).getClipBounds();
   }
}
