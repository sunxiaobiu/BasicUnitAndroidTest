import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_agexdev_theroadzambia_163311471 {
   public static void testCase() throws Exception {
      String var0 = "android";
      Object var1 = EasyMock.createMock(CursorFactory.class);
      SQLiteDatabase.openDatabase(var0, (CursorFactory)var1, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
