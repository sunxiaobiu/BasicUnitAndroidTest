import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_asroma_mobile__1367693867 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Cursor.class);
      Object var1 = EasyMock.createMock(ContentValues.class);
      DatabaseUtils.cursorStringToContentValuesIfPresent((Cursor)var0, (ContentValues)var1, "data3");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
