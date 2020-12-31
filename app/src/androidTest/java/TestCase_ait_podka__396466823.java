import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ait_podka__396466823 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      String var3 = "android";
      DatabaseUtils.longForQuery((SQLiteDatabase)var2, var3, (String[])null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
