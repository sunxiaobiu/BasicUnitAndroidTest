import android.database.DatabaseUtils.InsertHelper;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_imigraz_ralfmuellerbooklet_demo_1545080502 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      InsertHelper var1 = new InsertHelper((SQLiteDatabase)var2, "aliases");
      var1.execute();
   }
}
