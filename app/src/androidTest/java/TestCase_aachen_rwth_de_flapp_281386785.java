import android.graphics.Path;
import android.graphics.Path.Direction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_281386785 {
   @Test
   public void testCase() throws Exception {
      Path var5 = new Path();
      var5 = new Path();
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      Object var4 = EasyMock.createMock(Direction.class);
      var5.addCircle(var1, var2, var3, (Direction)var4);
   }
}
