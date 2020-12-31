import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution_1423564885 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var4 = ViewCompat.animate((View)var3);
      long var1 = 1L;
      var4.setDuration(var1);
   }
}
