import android.graphics.Canvas;
import android.graphics.Canvas.EdgeType;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_justsystems_atokmobile_tv_service__1290728347 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(Canvas.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      Object var4 = EasyMock.createMock(EdgeType.class);
      ((Canvas)var5).quickReject(var1, 0.0F, var2, var3, (EdgeType)var4);
   }
}
