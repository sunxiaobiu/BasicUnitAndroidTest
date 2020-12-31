import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_RustyLake_CubeEscapeTheCave__1802467682 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      Object var2 = EasyMock.createMock(Rect.class);
      Object var3 = EasyMock.createMock(Rect.class);
      Object var4 = EasyMock.createMock(Paint.class);
      ((Canvas)var5).drawBitmap((Bitmap)var1, (Rect)var2, (Rect)var3, (Paint)var4);
   }
}
