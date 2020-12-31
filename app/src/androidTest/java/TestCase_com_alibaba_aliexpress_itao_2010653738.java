import android.support.v4.app.FragmentActivity;
import android.support.v4.app.SharedElementCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_aliexpress_itao_2010653738 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentActivity.class);
      Object var1 = EasyMock.createMock(SharedElementCallback.class);
      ((FragmentActivity)var2).setExitSharedElementCallback((SharedElementCallback)var1);
   }
}
