import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_192818004 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      LayoutParams var3 = ((View)var2).getLayoutParams();
      android.support.design.widget.AppBarLayout.LayoutParams var4 = (android.support.design.widget.AppBarLayout.LayoutParams)var3;
      byte var1 = 1;
      var4.setScrollFlags(var1);
   }
}
