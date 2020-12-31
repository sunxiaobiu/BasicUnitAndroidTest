import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_archos_athome_center_2024803154 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentManager.class);
      Fragment var2 = ((FragmentManager)var1).findFragmentByTag("OVERLAY_FRAGMENT");
      var2.setHasOptionsMenu(true);
   }
}
