import android.support.design.widget.BottomSheetBehavior;
import android.view.View;
import android.view.ViewParent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__641003909 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      ViewParent var2 = ((View)var1).getParent();
      View var3 = (View)var2;
      BottomSheetBehavior var4 = BottomSheetBehavior.from(var3);
      var4.setHideable(false);
   }
}
