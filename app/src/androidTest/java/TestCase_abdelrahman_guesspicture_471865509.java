import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture_471865509 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      Object var2 = EasyMock.createMock(Matrix.class);
      Object var3 = EasyMock.createMock(Paint.class);
      ((Canvas)var4).drawBitmap((Bitmap)var1, (Matrix)var2, (Paint)var3);
   }
}
