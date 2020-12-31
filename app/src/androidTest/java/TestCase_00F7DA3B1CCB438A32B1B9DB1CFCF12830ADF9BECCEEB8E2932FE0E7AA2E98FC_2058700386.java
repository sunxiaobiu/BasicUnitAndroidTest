import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_00F7DA3B1CCB438A32B1B9DB1CFCF12830ADF9BECCEEB8E2932FE0E7AA2E98FC_2058700386 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      byte var1 = 1;
      DrawableCompat.setTint((Drawable)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
