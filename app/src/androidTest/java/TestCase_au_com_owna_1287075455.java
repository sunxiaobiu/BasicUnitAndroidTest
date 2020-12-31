import android.support.v4.app.FragmentActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_owna_1287075455 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentActivity.class);
      var1 = ((FragmentActivity)var1).getLastCustomNonConfigurationInstance();
   }
}
