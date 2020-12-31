import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bc_leg_1635752980 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SQLiteDatabase.class);
      String var1 = DatabaseUtils.stringForQuery((SQLiteDatabase)var0, "select sqlite_version()", (String[])null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
