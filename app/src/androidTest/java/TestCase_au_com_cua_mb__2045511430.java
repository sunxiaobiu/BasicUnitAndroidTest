import android.content.ContentProviderResult;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__2045511430 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      ArrayList var1 = new ArrayList();
      ContentProviderResult[] var3 = ((ContentResolver)var2).applyBatch("com.android.contacts", var1);
      ContentProviderResult var4 = var3[0];
      String var5 = var4.toString();
   }
}
