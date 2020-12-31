import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_aliexpress_itao__1564898816 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      ActivityOptionsCompat.makeScaleUpAnimation((View)var0, var1, var2, var3, var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
