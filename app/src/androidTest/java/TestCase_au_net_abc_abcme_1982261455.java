import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme_1982261455 {
   @Test
   public void testCase() throws Exception {
      PathMeasure var2 = new PathMeasure();
      Object var1 = EasyMock.createMock(Path.class);
      var2.setPath((Path)var1, false);
   }
}
