import android.support.v7.util.ListUpdateCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airbnb_lottie__4873301 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ListUpdateCallback.class);
      byte var1 = 1;
      ((ListUpdateCallback)var2).onInserted(0, var1);
   }
}
