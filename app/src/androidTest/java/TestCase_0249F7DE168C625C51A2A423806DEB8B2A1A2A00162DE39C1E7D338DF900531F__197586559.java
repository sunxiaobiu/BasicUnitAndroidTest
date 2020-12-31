import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__197586559 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Path.class);
      PathMeasure var1 = new PathMeasure((Path)var2, false);
      float var3 = var1.getLength();
   }
}
