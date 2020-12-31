import android.content.ContentQueryMap;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_sonyericsson_extras_liveware_1041925070 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      String[] var1 = new String[8];
      Cursor var3 = ((SQLiteDatabase)var2).query("old_widget", var1, (String)null, (String[])null, (String)null, (String)null, (String)null);
      ContentQueryMap var4 = new ContentQueryMap(var3, "_id", false, (Handler)null);
      var2 = null;
      ((ContentQueryMap)var2).close();
   }
}
