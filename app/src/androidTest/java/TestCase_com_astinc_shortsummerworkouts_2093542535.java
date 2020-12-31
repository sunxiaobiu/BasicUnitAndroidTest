import android.animation.ObjectAnimator;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_astinc_shortsummerworkouts_2093542535 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ImageView.class);
      int[] var1 = new int[1];
      ObjectAnimator.ofArgb(var0, "colorFilter", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
