import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_photosquare__862607801 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(RectF.class);
      ((Canvas)var2).saveLayer((RectF)var1, (Paint)null, 31);
   }
}
