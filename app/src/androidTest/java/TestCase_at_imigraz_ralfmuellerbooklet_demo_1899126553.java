import android.database.DatabaseUtils.InsertHelper;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_imigraz_ralfmuellerbooklet_demo_1899126553 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(SQLiteDatabase.class);
      InsertHelper var1 = new InsertHelper((SQLiteDatabase)var4, "ents");
      InsertHelper var5 = var1;
      byte var6 = 1;
      long var2 = 1L;
      var5.bind(var6, var2);
   }
}
