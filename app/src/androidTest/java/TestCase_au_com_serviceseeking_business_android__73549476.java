import android.animation.LayoutTransition;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking_business_android__73549476 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ViewGroup.class);
      LayoutTransition var2 = ((ViewGroup)var1).getLayoutTransition();
      boolean var3 = var2.isRunning();
   }
}
