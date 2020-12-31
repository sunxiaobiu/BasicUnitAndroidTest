import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D_1835340396 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var3 = ViewCompat.animate((View)var2);
      float var1 = 1.0F;
      var3.alpha(var1);
   }
}
