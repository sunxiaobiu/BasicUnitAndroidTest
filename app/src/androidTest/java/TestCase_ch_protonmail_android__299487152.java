import android.support.v4.widget.SwipeRefreshLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_protonmail_android__299487152 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SwipeRefreshLayout.class);
      ((SwipeRefreshLayout)var1).requestDisallowInterceptTouchEvent(false);
   }
}
