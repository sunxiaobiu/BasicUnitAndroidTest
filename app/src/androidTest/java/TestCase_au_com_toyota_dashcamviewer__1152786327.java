import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_toyota_dashcamviewer__1152786327 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ImageView.class);
      float var1 = ViewCompat.getAlpha((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
