import android.graphics.Bitmap;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_965189042 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Bitmap.class);
      ((Bitmap)var1).recycle();
   }
}
