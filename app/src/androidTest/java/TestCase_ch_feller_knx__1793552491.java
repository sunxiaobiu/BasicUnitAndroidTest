import android.support.v4.app.FragmentContainer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__1793552491 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentContainer.class);
      byte var1 = 1;
      ((FragmentContainer)var2).onFindViewById(var1);
   }
}
