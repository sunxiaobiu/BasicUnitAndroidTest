import android.content.Context;
import android.support.v4.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar_1602743311 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      ContextCompat.getColorStateList((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
