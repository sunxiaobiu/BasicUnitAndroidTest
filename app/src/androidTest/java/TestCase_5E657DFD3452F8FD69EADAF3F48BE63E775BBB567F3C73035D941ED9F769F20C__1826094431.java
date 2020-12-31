import android.view.View;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__1826094431 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(FragmentTransitionImpl.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(View.class);
      Object var3 = null;
      ((FragmentTransitionImpl)var4).scheduleHideFragmentView(var1, (View)var2, (ArrayList)var3);
   }
}
