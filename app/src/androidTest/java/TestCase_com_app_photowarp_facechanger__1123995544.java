import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_photowarp_facechanger__1123995544 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Rect.class);
      Object var2 = EasyMock.createMock(Op.class);
      ((Canvas)var3).clipRect((Rect)var1, (Op)var2);
   }
}
