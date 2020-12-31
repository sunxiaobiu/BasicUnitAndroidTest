import android.support.v7.util.ListUpdateCallback;
import android.support.v7.util.DiffUtil.DiffResult;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airbnb_lottie__316444326 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(DiffResult.class);
      Object var1 = EasyMock.createMock(ListUpdateCallback.class);
      ((DiffResult)var2).dispatchUpdatesTo((ListUpdateCallback)var1);
   }
}
