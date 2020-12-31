import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentHostCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__1430928967 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentHostCallback.class);
      Object var1 = EasyMock.createMock(Fragment.class);
      ((FragmentHostCallback)var2).onShouldSaveFragmentState((Fragment)var1);
   }
}
