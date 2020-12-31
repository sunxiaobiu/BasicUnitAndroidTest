import android.database.Cursor;
import android.database.DatabaseUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_inchurch_adhonep_1080688765 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Cursor.class);
      String var1 = DatabaseUtils.dumpCursorToString((Cursor)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
