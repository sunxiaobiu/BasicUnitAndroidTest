import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar__1565042711 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      ViewCompat.setScaleX((View)var0, 0.25F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
