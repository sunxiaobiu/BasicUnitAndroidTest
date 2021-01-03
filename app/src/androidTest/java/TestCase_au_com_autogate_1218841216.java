import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_autogate_1218841216 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var3 = ViewCompat.animate((View)var2);
      Object var1 = null;
      var3.withStartAction((Runnable)(new Runnable() {public void run() {}}));
   }
}
