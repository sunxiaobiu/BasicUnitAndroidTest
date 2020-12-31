import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calea_echo_2126665607 {
   @Test
   public void testCase() throws Exception {
      Object var6 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      float var4 = 1.0F;
      Object var5 = EasyMock.createMock(Paint.class);
      ((Canvas)var6).saveLayer(var1, var2, var3, var4, (Paint)var5);
   }
}
