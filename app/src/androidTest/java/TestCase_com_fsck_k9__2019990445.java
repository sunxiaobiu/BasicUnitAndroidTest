import android.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fsck_k9__2019990445 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentManager.class);
      boolean var2 = ((FragmentManager)var1).isDestroyed();
   }
}
