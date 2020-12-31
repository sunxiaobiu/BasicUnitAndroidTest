import android.support.v7.view.ActionMode;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes__1571661452 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ActionMode.class);
      Object var1 = EasyMock.createMock(View.class);
      ((ActionMode)var2).setCustomView((View)var1);
   }
}
