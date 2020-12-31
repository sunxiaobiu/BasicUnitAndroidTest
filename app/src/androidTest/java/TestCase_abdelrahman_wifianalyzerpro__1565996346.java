import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import androidx.test.runner.AndroidJUnit4;
import java.io.OutputStream;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__1565996346 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Bitmap.class);
      Object var1 = EasyMock.createMock(CompressFormat.class);
      Object var2 = null;
      ((Bitmap)var3).compress((CompressFormat)var1, 100, (OutputStream)var2);
   }
}
