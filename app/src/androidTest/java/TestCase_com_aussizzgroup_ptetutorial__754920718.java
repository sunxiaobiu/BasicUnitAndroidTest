import android.support.v4.widget.NestedScrollView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aussizzgroup_ptetutorial__754920718 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      View var2 = ((View)var1).findViewById(2131296776);
      NestedScrollView var3 = (NestedScrollView)var2;
      var3.pageScroll(33);
   }
}
