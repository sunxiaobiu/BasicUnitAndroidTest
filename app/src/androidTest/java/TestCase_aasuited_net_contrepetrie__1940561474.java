import android.database.sqlite.SQLiteStatement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aasuited_net_contrepetrie__1940561474 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteStatement.class);
      byte var1 = 1;
      byte[] var2 = new byte[1];
      ((SQLiteStatement)var3).bindBlob(var1, var2);
   }
}
