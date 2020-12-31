import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2592F03C66FE63F0E8FCD640918324E0792A7A1ABB26A21FF3F55A1E7987EB11_402777096 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var1 = new StringBuilder();
      String var2 = var1.toString();
      SQLiteDatabase var3 = SQLiteDatabase.openDatabase(var2, (CursorFactory)null, 1);
      var3.getPageSize();
   }
}
