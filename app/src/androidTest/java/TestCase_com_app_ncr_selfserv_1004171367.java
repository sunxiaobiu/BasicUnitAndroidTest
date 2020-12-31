import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_ncr_selfserv_1004171367 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Bitmap.class);
      Canvas var2 = new Canvas((Bitmap)var1);
      byte var3 = 1;
      var2.drawARGB(var3, 0, 0, 0);
   }
}
