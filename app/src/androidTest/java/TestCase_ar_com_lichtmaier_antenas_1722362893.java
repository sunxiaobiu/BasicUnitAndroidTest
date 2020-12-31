import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas_1722362893 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      byte var1 = 1;
      byte var2 = 1;
      ActivityOptionsCompat.makeScaleUpAnimation((View)var0, 0, 0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
