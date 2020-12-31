import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_allindiaradio__com_sriakhandpath__376879556 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      DrawableCompat.setHotspot((Drawable)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
