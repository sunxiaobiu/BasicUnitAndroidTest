import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture__582128072 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      long var0 = DatabaseUtils.queryNumEntries((SQLiteDatabase)var2, "events");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
