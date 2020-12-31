import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1_1351080295 {
   @Test
   public void testCase() throws Exception {
      Object var8 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      float var4 = 1.0F;
      float var5 = 1.0F;
      float var6 = 1.0F;
      Object var7 = EasyMock.createMock(TextPaint.class);
      ((Canvas)var8).drawArc(var1, var2, var3, var4, var5, var6, false, (Paint)var7);
   }
}
