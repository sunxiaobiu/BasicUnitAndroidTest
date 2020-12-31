import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_662963872 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Options.class);
      BitmapFactory.decodeByteArray(var0, 0, var1, (Options)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
