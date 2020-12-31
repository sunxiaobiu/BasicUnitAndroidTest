import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import androidx.core.widget.ImageViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66B8FF6FEF19F4A3B18356F38B168A4DC8ED776F527FB4F366A89D9A80321EAA_1727321203 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ImageView.class);
      Object var1 = EasyMock.createMock(Mode.class);
      ImageViewCompat.setImageTintMode((ImageView)var0, (Mode)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
