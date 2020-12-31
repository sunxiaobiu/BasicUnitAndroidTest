import android.support.v4.view.ViewPager;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appglu_trekepisodeguide_982887590 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ViewPager var3 = (ViewPager)var2;
      byte var1 = 1;
      var3.setDrawingCacheBackgroundColor(var1);
   }
}
