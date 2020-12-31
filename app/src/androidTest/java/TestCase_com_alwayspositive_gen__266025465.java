import android.graphics.Path;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alwayspositive_gen__266025465 {
   @Test
   public void testCase() throws Exception {
      Path var4 = new Path();
      Object var1 = EasyMock.createMock(RectF.class);
      float var2 = 1.0F;
      float var3 = 1.0F;
      var4.arcTo((RectF)var1, var2, var3, true);
   }
}
