import android.app.ActionBar;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_bellmedia_bnngo__1327384286 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ActionBar.class);
      ((ActionBar)var1).setDisplayShowCustomEnabled(true);
   }
}
