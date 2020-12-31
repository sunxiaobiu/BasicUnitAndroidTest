import android.support.v4.view.ViewPager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_launcher_smart_android_588982947 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ViewPager.class);
      ((ViewPager)var1).requestDisallowInterceptTouchEvent(true);
   }
}
