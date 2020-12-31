import android.graphics.Path;
import android.graphics.Region;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_maxlogix_englishgrammar__1770464991 {
   @Test
   public void testCase() throws Exception {
      Region var3 = new Region();
      Object var1 = EasyMock.createMock(Path.class);
      Object var2 = EasyMock.createMock(Region.class);
      var3.setPath((Path)var1, (Region)var2);
   }
}
