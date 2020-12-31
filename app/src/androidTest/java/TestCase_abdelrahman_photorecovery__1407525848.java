import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.BitmapFactory.Options;
import androidx.test.runner.AndroidJUnit4;
import java.io.InputStream;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__1407525848 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Options.class);
      BitmapFactory.decodeStream((InputStream)var0, (Rect)null, (Options)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
