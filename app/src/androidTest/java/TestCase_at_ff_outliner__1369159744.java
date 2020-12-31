import android.graphics.Path;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_ff_outliner__1369159744 {
   @Test
   public void testCase() throws Exception {
      Path var2 = new Path();
      Object var1 = EasyMock.createMock(RectF.class);
      var2.arcTo((RectF)var1, 270.0F, -180.0F);
   }
}
