import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar__1864966318 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      float var1 = 1.0F;
      ViewCompat.setY((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
