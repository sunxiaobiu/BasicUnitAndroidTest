import android.support.v4.view.ViewPager;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appglu_trekepisodeguide_76208378 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      ViewPager var2 = (ViewPager)var1;
      var2.setPersistentDrawingCache(3);
   }
}
