import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.LinearLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_mutabaahyaumiyah_1379624398 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(LinearLayout.class);
      String var1 = "android";
      Snackbar.make((View)var0, var1, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
