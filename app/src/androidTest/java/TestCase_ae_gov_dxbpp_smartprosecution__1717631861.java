import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution__1717631861 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Options.class);
      BitmapFactory.decodeResource((Resources)var0, var1, (Options)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
