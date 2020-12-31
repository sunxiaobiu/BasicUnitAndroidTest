import android.text.Spannable;
import android.text.SpannableString;
import android.text.util.Linkify;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aws_apps_usbDeviceEnumerator_936977093 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableString.class);
      Linkify.addLinks((Spannable)var0, 15);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
