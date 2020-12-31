import android.support.v4.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gocatchapp_goCatch_1363084703 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentTransaction.class);
      boolean var2 = ((FragmentTransaction)var1).isAddToBackStackAllowed();
   }
}
