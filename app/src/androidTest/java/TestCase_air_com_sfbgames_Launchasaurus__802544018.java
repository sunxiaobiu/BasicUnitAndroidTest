import android.graphics.Bitmap;
import androidx.test.runner.AndroidJUnit4;
import java.nio.Buffer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_sfbgames_Launchasaurus__802544018 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Bitmap.class);
      Object var1 = null;
      ((Bitmap)var2).copyPixelsToBuffer((Buffer)var1);
   }
}
