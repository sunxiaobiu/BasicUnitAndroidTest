import android.text.util.Rfc822Token;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cloudmagic_mail_1228111044 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = Rfc822Token.quoteNameIfNecessary(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
