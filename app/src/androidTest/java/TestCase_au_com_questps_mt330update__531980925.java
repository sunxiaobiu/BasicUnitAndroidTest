import android.graphics.PorterDuff.Mode;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.FrameLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_questps_mt330update__531980925 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(FrameLayout.class);
      Object var1 = EasyMock.createMock(Mode.class);
      ViewCompat.setBackgroundTintMode((View)var0, (Mode)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
