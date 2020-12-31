import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CA793F2BAB1860CEB2A6228890189D8E7A6051CE15C75FD5F193E6AF701E80D__471907152 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      ActivityCompat.postponeEnterTransition((Activity)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
