import android.animation.LayoutTransition;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_accaglobal_AccountingAndBusiness_Africa_1860776783 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ViewGroup.class);
      LayoutTransition var4 = ((ViewGroup)var3).getLayoutTransition();
      long var1 = var4.getDuration(3);
   }
}
