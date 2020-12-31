import android.media.ImageReader;
import android.util.Size;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adianteapps_drake_collectibles_2134758383 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Size.class);
      int var2 = ((Size)var1).getHeight();
      int var4 = ((Size)var1).getWidth();
      ImageReader var3 = ImageReader.newInstance(var4, var2, 256, 2);
      var3.close();
   }
}
