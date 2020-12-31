import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biblica_c4c_creative__253828093 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Rect.class);
      ((Canvas)var2).getClipBounds((Rect)var1);
   }
}
