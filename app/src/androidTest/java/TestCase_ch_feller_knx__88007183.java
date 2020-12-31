import android.support.v4.app.FragmentHostCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__88007183 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentHostCallback.class);
      boolean var2 = ((FragmentHostCallback)var1).onHasWindowAnimations();
   }
}
