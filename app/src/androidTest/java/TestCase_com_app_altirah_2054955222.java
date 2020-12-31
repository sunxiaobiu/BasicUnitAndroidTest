import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_altirah_2054955222 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Shape.class);
      Object var1 = EasyMock.createMock(Canvas.class);
      Object var2 = EasyMock.createMock(Paint.class);
      ((Shape)var3).draw((Canvas)var1, (Paint)var2);
   }
}
