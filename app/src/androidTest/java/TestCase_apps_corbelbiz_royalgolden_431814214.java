import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Path.Direction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_apps_corbelbiz_royalgolden_431814214 {
   @Test
   public void testCase() throws Exception {
      Path var3 = new Path();
      Object var1 = EasyMock.createMock(RectF.class);
      Object var2 = EasyMock.createMock(Direction.class);
      var3.addOval((RectF)var1, (Direction)var2);
   }
}
