import android.database.DatabaseUtils.InsertHelper;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_imigraz_ralfmuellerbooklet_demo__2088795835 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteDatabase.class);
      InsertHelper var1 = new InsertHelper((SQLiteDatabase)var3, "ents");
      InsertHelper var4 = var1;
      byte var5 = 1;
      byte var2 = 1;
      var4.bind(var5, var2);
   }
}
