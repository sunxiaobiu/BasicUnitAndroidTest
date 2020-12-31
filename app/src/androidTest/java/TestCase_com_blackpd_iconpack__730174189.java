import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region.Op;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blackpd_iconpack__730174189 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Path.class);
      Object var2 = EasyMock.createMock(Op.class);
      ((Canvas)var3).clipPath((Path)var1, (Op)var2);
   }
}
