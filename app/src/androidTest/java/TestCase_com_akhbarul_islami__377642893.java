import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_akhbarul_islami__377642893 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(RectF.class);
      ((Canvas)var2).saveLayerAlpha((RectF)var1, 0, 0);
   }
}
