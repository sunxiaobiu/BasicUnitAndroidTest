import android.content.Context;
import androidx.core.app.ActivityOptionsCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_11206D6C097DFB60C04B6294705DE3EEB3B07E08BCD71C659D27ADC2DE5F8433__1391386487 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      ActivityOptionsCompat var1 = ActivityOptionsCompat.makeCustomAnimation((Context)var0, 17432576, 17432577);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
