import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D_432528674 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var4 = ViewCompat.animate((View)var3);
      long var1 = 1L;
      var4.setStartDelay(var1);
   }
}
