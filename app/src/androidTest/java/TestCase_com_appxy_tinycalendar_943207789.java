import android.text.Spannable;
import android.text.SpannableString;
import android.text.util.Linkify;
import androidx.test.runner.AndroidJUnit4;
import java.util.regex.Pattern;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appxy_tinycalendar_943207789 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableString.class);
      Object var1 = null;
      Linkify.addLinks((Spannable)var0, (Pattern)var1, "geo:0,0?q=");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
