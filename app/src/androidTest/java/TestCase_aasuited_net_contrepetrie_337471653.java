import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aasuited_net_contrepetrie_337471653 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SQLiteDatabase.class);
      SQLiteStatement var2 = ((SQLiteDatabase)var1).compileStatement("SELECT CHANGES()");
   }
}
