import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_139455888 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Cursor.class);
      byte var1 = 1;
      ((Cursor)var2).getType(var1);
   }
}
