import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_clientapp_swiftcom_org_1628986433 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      byte var1 = 1;
      ((SQLiteDatabase)var2).needUpgrade(var1);
   }
}
