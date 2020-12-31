import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.graphics.drawable.VectorDrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_rvangorp_crowdfundtrackerwidget_1891449318 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Theme.class);
      VectorDrawableCompat.create((Resources)var0, var1, (Theme)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
