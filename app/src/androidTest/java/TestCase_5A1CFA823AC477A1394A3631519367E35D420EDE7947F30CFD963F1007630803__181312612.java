import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A1CFA823AC477A1394A3631519367E35D420EDE7947F30CFD963F1007630803__181312612 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      long var0 = DatabaseUtils.queryNumEntries((SQLiteDatabase)var2, "Level", "_id>1 and lscore!=0");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
