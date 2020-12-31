import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_1439709760 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      ContentResolver var4 = var3.getContentResolver();
      String[] var1 = new String[1];
      Object var2 = EasyMock.createMock(Uri.class);
      Cursor var5 = var4.query((Uri)var2, var1, (String)null, (String[])null, (String)null);
      int var6 = var5.getColumnIndexOrThrow("_data");
   }
}
