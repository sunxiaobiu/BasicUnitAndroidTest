import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aasuited_net_contrepetrie_983704423 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteDatabase.class);
      SQLiteStatement var4 = ((SQLiteDatabase)var3).compileStatement("SELECT CHANGES()");
      long var1 = var4.simpleQueryForLong();
   }
}
