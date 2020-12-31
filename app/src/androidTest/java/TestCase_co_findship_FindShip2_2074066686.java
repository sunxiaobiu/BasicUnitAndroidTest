import android.graphics.Matrix;
import android.graphics.Path;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_findship_FindShip2_2074066686 {
   @Test
   public void testCase() throws Exception {
      Path var3 = new Path();
      Object var1 = EasyMock.createMock(Matrix.class);
      Object var2 = EasyMock.createMock(Path.class);
      var3.transform((Matrix)var1, (Path)var2);
   }
}
