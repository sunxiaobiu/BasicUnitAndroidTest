import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0E8A815FFBF44567AB8C2DC559AE304F5B4C14AAAE2B15219ACEB78B6C0BBB8F_1892346187 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentManager.class);
      FragmentTransaction var3 = ((FragmentManager)var2).beginTransaction();
      Object var1 = EasyMock.createMock(Fragment.class);
      var3.setPrimaryNavigationFragment((Fragment)var1);
   }
}
