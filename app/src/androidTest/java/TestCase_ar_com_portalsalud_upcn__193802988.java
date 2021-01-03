import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_portalsalud_upcn__193802988 {
   @Test
   public void testCase() throws Exception {
      String[] var4 = new String[1];
      Object var1 = EasyMock.createMock(Uri.class);
      Context var2 = InstrumentationRegistry.getTargetContext();
      CursorLoader var3 = new CursorLoader(var2, (Uri)var1, var4, (String)"android", (String[])null, (String)"android");
      Cursor var5 = var3.loadInBackground();
   }
}
