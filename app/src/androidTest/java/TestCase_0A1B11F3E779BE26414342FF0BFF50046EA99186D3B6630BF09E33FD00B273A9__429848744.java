import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0A1B11F3E779BE26414342FF0BFF50046EA99186D3B6630BF09E33FD00B273A9__429848744 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var2 = ViewCompat.animate((View)var1);
      var2 = var2.alpha(1.0F);
      var2 = (ViewPropertyAnimatorCompat)var2;
      var2.start();
   }
}
