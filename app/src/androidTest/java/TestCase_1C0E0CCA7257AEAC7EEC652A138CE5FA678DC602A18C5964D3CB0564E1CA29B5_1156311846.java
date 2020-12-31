import android.text.util.Linkify;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import java.util.regex.Pattern;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1C0E0CCA7257AEAC7EEC652A138CE5FA678DC602A18C5964D3CB0564E1CA29B5_1156311846 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      Object var1 = null;
      Linkify.addLinks((TextView)var0, (Pattern)var1, "tel:");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
