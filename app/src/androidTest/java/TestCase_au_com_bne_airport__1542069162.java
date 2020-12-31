import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bne_airport__1542069162 {
   @Test
   public void testCase() throws Exception {
      Object var6 = EasyMock.createMock(Canvas.class);
      Object var1 = null;
      byte var2 = 1;
      float var3 = 1.0F;
      float var4 = 1.0F;
      Object var5 = EasyMock.createMock(Paint.class);
      ((Canvas)var6).drawText((CharSequence)var1, 0, var2, var3, var4, (Paint)var5);
   }
}
