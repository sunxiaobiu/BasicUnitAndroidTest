import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_rogers_unison__1387541482 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      Object var1 = null;
      PhoneNumberUtils.getNumberFromIntent((Intent)var0, (Context)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
