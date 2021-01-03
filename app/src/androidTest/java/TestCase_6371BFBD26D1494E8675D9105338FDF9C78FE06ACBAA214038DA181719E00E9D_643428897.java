import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6371BFBD26D1494E8675D9105338FDF9C78FE06ACBAA214038DA181719E00E9D_643428897 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ViewGroup.class);
      ViewPropertyAnimatorCompat var3 = ViewCompat.animate((View)var2);
      Object var1 = null;
      var3.withStartAction((Runnable)(new Runnable() {public void run() {}}));
   }
}
