import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_agexdev_physics_2030659103 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(RectF.class);
      Object var2 = EasyMock.createMock(Paint.class);
      ((Canvas)var3).drawOval((RectF)var1, (Paint)var2);
   }
}
