import android.accounts.Account;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android_1303220123 {
   public static void testCase() throws Exception {
      String var0 = "android";
      ContentResolver.cancelSync((Account)null, var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
