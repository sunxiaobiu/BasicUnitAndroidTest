import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas__1666273763 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      ViewPropertyAnimatorCompat var1 = ViewCompat.animate((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
