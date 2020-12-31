import android.preference.Preference;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hb_dialer_free__1476310219 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Preference.class);
      Object var1 = null;
      boolean var2 = true;
      ((Preference)var3).onParentChanged((Preference)var1, var2);
   }
}
