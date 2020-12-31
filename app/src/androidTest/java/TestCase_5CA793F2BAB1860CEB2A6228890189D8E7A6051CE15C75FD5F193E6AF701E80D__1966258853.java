import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CA793F2BAB1860CEB2A6228890189D8E7A6051CE15C75FD5F193E6AF701E80D__1966258853 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(SharedElementCallback.class);
      ActivityCompat.setEnterSharedElementCallback((Activity)var0, (SharedElementCallback)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
