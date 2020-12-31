import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_mobile_security__64728815 {
   @Test
   public void testCase() throws Exception {
      Uri var1 = Uri.parse("content://com.alibaba.mobile.security.provider/junk/apk");
      Builder var2 = ContentProviderOperation.newDelete(var1);
      ContentProviderOperation var3 = var2.build();
   }
}
