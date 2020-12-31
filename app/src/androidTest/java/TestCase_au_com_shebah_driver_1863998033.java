import android.support.design.widget.CoordinatorLayout.Behavior;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_shebah_driver_1863998033 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      LayoutParams var2 = ((View)var1).getLayoutParams();
      android.support.design.widget.CoordinatorLayout.LayoutParams var3 = (android.support.design.widget.CoordinatorLayout.LayoutParams)var2;
      Behavior var4 = var3.getBehavior();
   }
}
