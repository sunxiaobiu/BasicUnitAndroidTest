import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar_752586400 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentManager.class);
      FragmentTransaction var2 = ((FragmentManager)var1).beginTransaction();
      var2.commitNow();
   }
}
