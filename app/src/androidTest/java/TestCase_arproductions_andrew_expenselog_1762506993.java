import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_expenselog_1762506993 {
   @Test
   public void testCase() throws Exception {
      String[] var4 = new String[1];
      Object var1 = EasyMock.createMock(Uri.class);
      Context var2 = InstrumentationRegistry.getTargetContext();
      CursorLoader var3 = new CursorLoader(var2, (Uri)var1, var4, (String)null, (String[])null, (String)null);
      Cursor var5 = var3.loadInBackground();
   }
}
