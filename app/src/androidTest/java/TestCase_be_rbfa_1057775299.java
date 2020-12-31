import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_rbfa_1057775299 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      Toolbar var2 = (Toolbar)var1;
      DecorToolbar var3 = var2.getWrapper();
   }
}
