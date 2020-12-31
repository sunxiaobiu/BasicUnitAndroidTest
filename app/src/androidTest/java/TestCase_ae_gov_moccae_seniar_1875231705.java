import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.LinearLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar_1875231705 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(LinearLayout.class);
      ViewCompat.setAlpha((View)var0, 1.0F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
