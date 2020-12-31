import android.database.sqlite.SQLiteOpenHelper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E2E34FB94B386551E9A46C3CB7124F310286143A4A79FBDE1003C79A053185D__778663522 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SQLiteOpenHelper.class);
      long var1 = 1L;
      ((SQLiteOpenHelper)var3).setIdleConnectionTimeout(var1);
   }
}
