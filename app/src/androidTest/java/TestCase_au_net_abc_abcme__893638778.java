import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme__893638778 {
   @Test
   public void testCase() throws Exception {
      PathMeasure var4 = new PathMeasure();
      float var1 = 1.0F;
      float var2 = 1.0F;
      Object var3 = EasyMock.createMock(Path.class);
      var4.getSegment(var1, var2, (Path)var3, true);
   }
}
