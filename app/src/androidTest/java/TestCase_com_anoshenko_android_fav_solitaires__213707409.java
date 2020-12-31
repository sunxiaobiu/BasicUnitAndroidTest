import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_anoshenko_android_fav_solitaires__213707409 {
   @Test
   public void testCase() throws Exception {
      Object var7 = EasyMock.createMock(Canvas.class);
      String var1 = "android";
      byte var2 = 1;
      byte var3 = 1;
      float var4 = 1.0F;
      float var5 = 1.0F;
      Object var6 = EasyMock.createMock(Paint.class);
      ((Canvas)var7).drawText(var1, var2, var3, var4, var5, (Paint)var6);
   }
}
