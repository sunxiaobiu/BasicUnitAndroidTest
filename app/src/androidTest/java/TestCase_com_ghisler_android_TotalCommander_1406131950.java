import android.content.ContentResolver;
import android.content.UriPermission;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ghisler_android_TotalCommander_1406131950 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ContentResolver.class);
      List var2 = ((ContentResolver)var1).getPersistedUriPermissions();
      Iterator var3 = var2.iterator();
      var1 = var3.next();
      UriPermission var4 = (UriPermission)var1;
      boolean var5 = var4.isWritePermission();
   }
}
