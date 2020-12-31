import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bambuna_podcastaddict_912236624 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SimpleOnPageChangeListener.class);
      byte var1 = 1;
      ((SimpleOnPageChangeListener)var2).onPageSelected(var1);
   }
}
