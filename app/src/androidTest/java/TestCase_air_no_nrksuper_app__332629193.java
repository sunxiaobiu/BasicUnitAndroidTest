import android.graphics.Matrix;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app__332629193 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Matrix.class);
      Object var1 = EasyMock.createMock(Matrix.class);
      ((Matrix)var2).postConcat((Matrix)var1);
   }
}
