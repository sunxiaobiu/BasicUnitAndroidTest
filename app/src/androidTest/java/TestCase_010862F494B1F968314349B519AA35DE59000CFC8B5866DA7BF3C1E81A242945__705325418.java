import android.database.sqlite.SQLiteStatement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945__705325418 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteStatement.class);
      long var1 = 1L;
      ((SQLiteStatement)var3).bindLong(1, var1);
   }
}
