import android.graphics.Bitmap;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__1828325020 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Bitmap.class);
      Object var1 = EasyMock.createMock(Paint.class);
      int[] var2 = new int[1];
      ((Bitmap)var3).extractAlpha((Paint)var1, var2);
   }
}
