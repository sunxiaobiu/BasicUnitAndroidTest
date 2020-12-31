import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ACC7934C85E60CF203196A04D0E1419D9BCC88C9732B56E84BA6A95EF05DE46_366750455 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      Object var4 = EasyMock.createMock(Paint.class);
      ((Canvas)var5).drawRoundRect(0.0F, 0.0F, var1, var2, var3, var3, (Paint)var4);
   }
}
