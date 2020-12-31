import android.graphics.Canvas;
import android.graphics.Region.Op;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_148B211146287F02D730012642D13D8C6CD135D0BFDB9D8E161AB63CBBACF583__539811326 {
   @Test
   public void testCase() throws Exception {
      Object var6 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      float var4 = 1.0F;
      Object var5 = EasyMock.createMock(Op.class);
      ((Canvas)var6).clipRect(var1, var2, var3, var4, (Op)var5);
   }
}
