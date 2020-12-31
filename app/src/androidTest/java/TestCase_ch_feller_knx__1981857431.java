import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentHostCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__1981857431 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentHostCallback.class);
      Object var1 = EasyMock.createMock(Fragment.class);
      ((FragmentHostCallback)var2).onShouldSaveFragmentState((Fragment)var1);
   }
}
