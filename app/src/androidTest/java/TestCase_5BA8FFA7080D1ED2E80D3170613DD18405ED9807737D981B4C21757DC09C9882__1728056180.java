import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BA8FFA7080D1ED2E80D3170613DD18405ED9807737D981B4C21757DC09C9882__1728056180 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var2 = ViewCompat.animate((View)var1);
      var2.cancel();
   }
}
