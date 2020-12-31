import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_asroma_mobile__712913064 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableStringBuilder.class);
      byte var1 = 1;
      PhoneNumberUtils.formatNumber((Editable)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
