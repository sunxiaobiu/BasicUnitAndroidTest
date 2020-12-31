import android.graphics.Canvas;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_ubank_urhome__1372217926 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      byte var3 = 1;
      ((Canvas)var4).saveLayerAlpha(0.0F, 0.0F, var1, var2, var3, 31);
   }
}
