import android.graphics.Matrix;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote__389004599 {
   @Test
   public void testCase() throws Exception {
      Matrix var2 = new Matrix();
      Object var1 = EasyMock.createMock(Matrix.class);
      var2.setConcat(var2, (Matrix)var1);
   }
}
