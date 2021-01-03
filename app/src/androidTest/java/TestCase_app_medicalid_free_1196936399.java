import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free_1196936399 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteDatabase.class);
      Object var1 = null;
      String var2 = "android";
      ((SQLiteDatabase)var3).rawQueryWithFactory((CursorFactory)var1, var2, (String[])null, (String)"android");
   }
}
