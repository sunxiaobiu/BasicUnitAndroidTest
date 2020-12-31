import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6_727228722 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ConnectivityManager.class);
      Network var2 = ((ConnectivityManager)var1).getActiveNetwork();
   }
}
