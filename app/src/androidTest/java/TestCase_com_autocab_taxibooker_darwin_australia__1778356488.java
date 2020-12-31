import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_autocab_taxibooker_darwin_australia__1778356488 {
   @Test
   public void testCase() throws Exception {
      float[] var1 = new float[8];
      RoundRectShape var3 = new RoundRectShape(var1, (RectF)null, (float[])null);
      Object var4 = EasyMock.createMock(Canvas.class);
      Object var2 = EasyMock.createMock(Paint.class);
      var3.draw((Canvas)var4, (Paint)var2);
   }
}
