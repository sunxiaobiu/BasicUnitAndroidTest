import android.graphics.Path;
import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_camerasideas_instashot__1015468316 {
   @Test
   public void testCase() throws Exception {
      Path var2 = new Path();
      Object var1 = EasyMock.createMock(RectF.class);
      var2.computeBounds((RectF)var1, true);
   }
}
