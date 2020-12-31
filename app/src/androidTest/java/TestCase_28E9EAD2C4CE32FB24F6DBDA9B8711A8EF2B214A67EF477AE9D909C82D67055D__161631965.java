import android.graphics.PorterDuff.Mode;
import androidx.appcompat.widget.DrawableUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_28E9EAD2C4CE32FB24F6DBDA9B8711A8EF2B214A67EF477AE9D909C82D67055D__161631965 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Mode.class);
      byte var1 = 1;
      DrawableUtils.parseTintMode(var1, (Mode)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
