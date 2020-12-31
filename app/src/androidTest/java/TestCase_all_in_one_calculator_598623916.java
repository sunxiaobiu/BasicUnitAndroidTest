import android.support.v7.widget.Toolbar;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_all_in_one_calculator_598623916 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Toolbar.class);
      Object var1 = null;
      Object var2 = null;
      ((Toolbar)var3).findViewsWithText((ArrayList)var1, (CharSequence)var2, 2);
   }
}
