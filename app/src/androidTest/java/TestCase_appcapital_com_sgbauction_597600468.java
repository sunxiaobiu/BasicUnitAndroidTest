import android.support.v4.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_appcapital_com_sgbauction_597600468 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentManager.class);
      byte var1 = 1;
      ((FragmentManager)var2).popBackStack(var1, 1);
   }
}
