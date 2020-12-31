import android.content.ContentResolver;
import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager__665800006 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      ContentResolver var2 = var1.getContentResolver();
      List var3 = var2.getPersistedUriPermissions();
      Iterator var4 = var3.iterator();
      Object var5 = var4.next();
      UriPermission var6 = (UriPermission)var5;
      Uri var7 = var6.getUri();
   }
}
