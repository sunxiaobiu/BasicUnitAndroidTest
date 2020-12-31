import android.graphics.PorterDuff.Mode;
import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bitstrips_imoji__1587304534 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      Mode var1 = ViewCompat.getBackgroundTintMode((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
