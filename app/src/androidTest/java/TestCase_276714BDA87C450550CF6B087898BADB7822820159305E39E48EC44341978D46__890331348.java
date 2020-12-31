import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_276714BDA87C450550CF6B087898BADB7822820159305E39E48EC44341978D46__890331348 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SQLiteDatabase.class);
      ((SQLiteDatabase)var1).disableWriteAheadLogging();
   }
}
