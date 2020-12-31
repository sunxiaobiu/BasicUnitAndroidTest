import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_38A614208A9231B84F176DFD756DBFD034B5F20E4476AFC990762CD48F97BEF8__401885793 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SQLiteDatabase.class);
      boolean var2 = ((SQLiteDatabase)var1).isDbLockedByOtherThreads();
   }
}
