import android.support.v4.widget.NestedScrollView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_1460494955 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      NestedScrollView var2 = (NestedScrollView)var1;
      var2.scrollTo(0, 0);
   }
}
