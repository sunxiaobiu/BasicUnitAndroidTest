import android.content.ContentProviderOperation;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_realestate_app_547272976 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ArrayList.class);
      Iterator var2 = ((ArrayList)var1).iterator();
      var1 = var2.next();
      ContentProviderOperation var3 = (ContentProviderOperation)var1;
      Uri var4 = var3.getUri();
   }
}
