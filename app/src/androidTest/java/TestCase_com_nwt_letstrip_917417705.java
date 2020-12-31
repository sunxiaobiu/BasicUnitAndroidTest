import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_nwt_letstrip_917417705 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      byte var1 = 1;
      DrawableCompat.setLayoutDirection((Drawable)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
