import android.content.res.Resources;
import android.graphics.BitmapFactory;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_1341217031 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      BitmapFactory.decodeResource((Resources)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
