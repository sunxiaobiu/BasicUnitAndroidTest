import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5C7833B87EC506D53FA11853F84D16062AA4666BB1FFDB7AAD9AA89C880EB027__1275148834 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(RectF.class);
      Object var2 = EasyMock.createMock(Paint.class);
      ((Canvas)var3).saveLayer((RectF)var1, (Paint)var2);
   }
}
