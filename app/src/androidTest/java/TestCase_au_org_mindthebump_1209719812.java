import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_org_mindthebump_1209719812 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Cursor.class);
      boolean var2 = ((Cursor)var1).isBeforeFirst();
   }
}
