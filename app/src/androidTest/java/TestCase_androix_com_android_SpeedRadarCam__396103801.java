import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_androix_com_android_SpeedRadarCam__396103801 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      Object var3 = EasyMock.createMock(Paint.class);
      ((Canvas)var4).drawPoint(var1, var2, (Paint)var3);
   }
}
