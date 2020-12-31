import android.database.sqlite.SQLiteStatement;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945__1141023923 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteStatement.class);
      String var1 = "android";
      ((SQLiteStatement)var2).bindString(2, var1);
   }
}
