import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_angryrobot_wikicamps__2000420196 {
   @Test
   public void testCase() throws Exception {
      Canvas var2 = new Canvas();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.setBitmap((Bitmap)var1);
   }
}
