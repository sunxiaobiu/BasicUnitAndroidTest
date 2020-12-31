import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.BitmapFactory.Options;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app__1951150569 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Options.class);
      BitmapFactory.decodeFileDescriptor((FileDescriptor)var0, (Rect)null, (Options)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
