import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__582674127 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SQLiteDatabase.class);
      Cursor var2 = ((SQLiteDatabase)var1).rawQuery("SELECT * FROM hits2 WHERE 0", (String[])null);
      String[] var3 = var2.getColumnNames();
   }
}
