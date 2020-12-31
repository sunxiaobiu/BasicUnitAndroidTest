import android.database.sqlite.SQLiteStatement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aasuited_net_contrepetrie__1573868032 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteStatement.class);
      byte var1 = 1;
      ((SQLiteStatement)var2).bindNull(var1);
   }
}
