import android.graphics.Matrix;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_422045072 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Matrix.class);
      Object var1 = EasyMock.createMock(Matrix.class);
      ((Matrix)var2).preConcat((Matrix)var1);
   }
}
