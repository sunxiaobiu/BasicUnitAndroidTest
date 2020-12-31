import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_acowboys_oldmovies_248296805 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteDatabase.class);
      long var1 = 1L;
      ((SQLiteDatabase)var3).setPageSize(var1);
   }
}
