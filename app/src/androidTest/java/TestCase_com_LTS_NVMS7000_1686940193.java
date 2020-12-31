import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_LTS_NVMS7000_1686940193 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      boolean var1 = ViewCompat.isOpaque((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
